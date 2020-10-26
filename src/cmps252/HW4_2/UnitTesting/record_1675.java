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

@Tag("49")
class Record_1675 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1675: FirstName is Alma")
	void FirstNameOfRecord1675() {
		assertEquals("Alma", customers.get(1674).getFirstName());
	}

	@Test
	@DisplayName("Record 1675: LastName is Lightsey")
	void LastNameOfRecord1675() {
		assertEquals("Lightsey", customers.get(1674).getLastName());
	}

	@Test
	@DisplayName("Record 1675: Company is C Chase Company")
	void CompanyOfRecord1675() {
		assertEquals("C Chase Company", customers.get(1674).getCompany());
	}

	@Test
	@DisplayName("Record 1675: Address is 400 Morris Ave")
	void AddressOfRecord1675() {
		assertEquals("400 Morris Ave", customers.get(1674).getAddress());
	}

	@Test
	@DisplayName("Record 1675: City is Denville")
	void CityOfRecord1675() {
		assertEquals("Denville", customers.get(1674).getCity());
	}

	@Test
	@DisplayName("Record 1675: County is Morris")
	void CountyOfRecord1675() {
		assertEquals("Morris", customers.get(1674).getCounty());
	}

	@Test
	@DisplayName("Record 1675: State is NJ")
	void StateOfRecord1675() {
		assertEquals("NJ", customers.get(1674).getState());
	}

	@Test
	@DisplayName("Record 1675: ZIP is 7834")
	void ZIPOfRecord1675() {
		assertEquals("7834", customers.get(1674).getZIP());
	}

	@Test
	@DisplayName("Record 1675: Phone is 973-625-0921")
	void PhoneOfRecord1675() {
		assertEquals("973-625-0921", customers.get(1674).getPhone());
	}

	@Test
	@DisplayName("Record 1675: Fax is 973-625-3802")
	void FaxOfRecord1675() {
		assertEquals("973-625-3802", customers.get(1674).getFax());
	}

	@Test
	@DisplayName("Record 1675: Email is alma@lightsey.com")
	void EmailOfRecord1675() {
		assertEquals("alma@lightsey.com", customers.get(1674).getEmail());
	}

	@Test
	@DisplayName("Record 1675: Web is http://www.almalightsey.com")
	void WebOfRecord1675() {
		assertEquals("http://www.almalightsey.com", customers.get(1674).getWeb());
	}
}
