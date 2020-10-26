package cmps252.HW4_2.UnitTesting;

import static org.junit.jupiter.api.Assertions.*;
import java.io.FileNotFoundException;
import java.util.List;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import cmps252.HW4_2.Customer;
import cmps252.HW4_2.FileParser;

@Tag("9")
class Record_3927 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3927: FirstName is Jewel")
	void FirstNameOfRecord3927() {
		assertEquals("Jewel", customers.get(3926).getFirstName());
	}

	@Test
	@DisplayName("Record 3927: LastName is Synder")
	void LastNameOfRecord3927() {
		assertEquals("Synder", customers.get(3926).getLastName());
	}

	@Test
	@DisplayName("Record 3927: Company is H & R Block")
	void CompanyOfRecord3927() {
		assertEquals("H & R Block", customers.get(3926).getCompany());
	}

	@Test
	@DisplayName("Record 3927: Address is Security")
	void AddressOfRecord3927() {
		assertEquals("Security", customers.get(3926).getAddress());
	}

	@Test
	@DisplayName("Record 3927: City is Utica")
	void CityOfRecord3927() {
		assertEquals("Utica", customers.get(3926).getCity());
	}

	@Test
	@DisplayName("Record 3927: County is Onyda")
	void CountyOfRecord3927() {
		assertEquals("Onyda", customers.get(3926).getCounty());
	}

	@Test
	@DisplayName("Record 3927: State is NY")
	void StateOfRecord3927() {
		assertEquals("NY", customers.get(3926).getState());
	}

	@Test
	@DisplayName("Record 3927: ZIP is 13501")
	void ZIPOfRecord3927() {
		assertEquals("13501", customers.get(3926).getZIP());
	}

	@Test
	@DisplayName("Record 3927: Phone is 315-724-5260")
	void PhoneOfRecord3927() {
		assertEquals("315-724-5260", customers.get(3926).getPhone());
	}

	@Test
	@DisplayName("Record 3927: Fax is 315-724-2449")
	void FaxOfRecord3927() {
		assertEquals("315-724-2449", customers.get(3926).getFax());
	}

	@Test
	@DisplayName("Record 3927: Email is jewel@synder.com")
	void EmailOfRecord3927() {
		assertEquals("jewel@synder.com", customers.get(3926).getEmail());
	}

	@Test
	@DisplayName("Record 3927: Web is http://www.jewelsynder.com")
	void WebOfRecord3927() {
		assertEquals("http://www.jewelsynder.com", customers.get(3926).getWeb());
	}
}
