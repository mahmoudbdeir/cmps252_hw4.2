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
class Record_2421 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2421: FirstName is Aisha")
	void FirstNameOfRecord2421() {
		assertEquals("Aisha", customers.get(2420).getFirstName());
	}

	@Test
	@DisplayName("Record 2421: LastName is Gasienica")
	void LastNameOfRecord2421() {
		assertEquals("Gasienica", customers.get(2420).getLastName());
	}

	@Test
	@DisplayName("Record 2421: Company is Hicks, Richard H Jr")
	void CompanyOfRecord2421() {
		assertEquals("Hicks, Richard H Jr", customers.get(2420).getCompany());
	}

	@Test
	@DisplayName("Record 2421: Address is 427 Washington St")
	void AddressOfRecord2421() {
		assertEquals("427 Washington St", customers.get(2420).getAddress());
	}

	@Test
	@DisplayName("Record 2421: City is Dayton")
	void CityOfRecord2421() {
		assertEquals("Dayton", customers.get(2420).getCity());
	}

	@Test
	@DisplayName("Record 2421: County is Montgomery")
	void CountyOfRecord2421() {
		assertEquals("Montgomery", customers.get(2420).getCounty());
	}

	@Test
	@DisplayName("Record 2421: State is OH")
	void StateOfRecord2421() {
		assertEquals("OH", customers.get(2420).getState());
	}

	@Test
	@DisplayName("Record 2421: ZIP is 45402")
	void ZIPOfRecord2421() {
		assertEquals("45402", customers.get(2420).getZIP());
	}

	@Test
	@DisplayName("Record 2421: Phone is 937-671-0867")
	void PhoneOfRecord2421() {
		assertEquals("937-671-0867", customers.get(2420).getPhone());
	}

	@Test
	@DisplayName("Record 2421: Fax is 937-671-3239")
	void FaxOfRecord2421() {
		assertEquals("937-671-3239", customers.get(2420).getFax());
	}

	@Test
	@DisplayName("Record 2421: Email is aisha@gasienica.com")
	void EmailOfRecord2421() {
		assertEquals("aisha@gasienica.com", customers.get(2420).getEmail());
	}

	@Test
	@DisplayName("Record 2421: Web is http://www.aishagasienica.com")
	void WebOfRecord2421() {
		assertEquals("http://www.aishagasienica.com", customers.get(2420).getWeb());
	}
}
