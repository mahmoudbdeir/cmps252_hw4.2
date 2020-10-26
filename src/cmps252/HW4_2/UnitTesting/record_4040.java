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

@Tag("26")
class Record_4040 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4040: FirstName is Isabel")
	void FirstNameOfRecord4040() {
		assertEquals("Isabel", customers.get(4039).getFirstName());
	}

	@Test
	@DisplayName("Record 4040: LastName is Piets")
	void LastNameOfRecord4040() {
		assertEquals("Piets", customers.get(4039).getLastName());
	}

	@Test
	@DisplayName("Record 4040: Company is Miller, Richard L")
	void CompanyOfRecord4040() {
		assertEquals("Miller, Richard L", customers.get(4039).getCompany());
	}

	@Test
	@DisplayName("Record 4040: Address is 1073 Old York Rd")
	void AddressOfRecord4040() {
		assertEquals("1073 Old York Rd", customers.get(4039).getAddress());
	}

	@Test
	@DisplayName("Record 4040: City is Abington")
	void CityOfRecord4040() {
		assertEquals("Abington", customers.get(4039).getCity());
	}

	@Test
	@DisplayName("Record 4040: County is Montgomery")
	void CountyOfRecord4040() {
		assertEquals("Montgomery", customers.get(4039).getCounty());
	}

	@Test
	@DisplayName("Record 4040: State is PA")
	void StateOfRecord4040() {
		assertEquals("PA", customers.get(4039).getState());
	}

	@Test
	@DisplayName("Record 4040: ZIP is 19001")
	void ZIPOfRecord4040() {
		assertEquals("19001", customers.get(4039).getZIP());
	}

	@Test
	@DisplayName("Record 4040: Phone is 215-884-2816")
	void PhoneOfRecord4040() {
		assertEquals("215-884-2816", customers.get(4039).getPhone());
	}

	@Test
	@DisplayName("Record 4040: Fax is 215-884-9706")
	void FaxOfRecord4040() {
		assertEquals("215-884-9706", customers.get(4039).getFax());
	}

	@Test
	@DisplayName("Record 4040: Email is isabel@piets.com")
	void EmailOfRecord4040() {
		assertEquals("isabel@piets.com", customers.get(4039).getEmail());
	}

	@Test
	@DisplayName("Record 4040: Web is http://www.isabelpiets.com")
	void WebOfRecord4040() {
		assertEquals("http://www.isabelpiets.com", customers.get(4039).getWeb());
	}
}
