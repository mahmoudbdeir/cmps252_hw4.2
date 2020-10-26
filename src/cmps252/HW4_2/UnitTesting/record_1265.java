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

@Tag("28")
class Record_1265 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1265: FirstName is Donovan")
	void FirstNameOfRecord1265() {
		assertEquals("Donovan", customers.get(1264).getFirstName());
	}

	@Test
	@DisplayName("Record 1265: LastName is Kuzel")
	void LastNameOfRecord1265() {
		assertEquals("Kuzel", customers.get(1264).getLastName());
	}

	@Test
	@DisplayName("Record 1265: Company is Specialty Ring Products")
	void CompanyOfRecord1265() {
		assertEquals("Specialty Ring Products", customers.get(1264).getCompany());
	}

	@Test
	@DisplayName("Record 1265: Address is 476 Oak St")
	void AddressOfRecord1265() {
		assertEquals("476 Oak St", customers.get(1264).getAddress());
	}

	@Test
	@DisplayName("Record 1265: City is Indian Orchard")
	void CityOfRecord1265() {
		assertEquals("Indian Orchard", customers.get(1264).getCity());
	}

	@Test
	@DisplayName("Record 1265: County is Hampden")
	void CountyOfRecord1265() {
		assertEquals("Hampden", customers.get(1264).getCounty());
	}

	@Test
	@DisplayName("Record 1265: State is MA")
	void StateOfRecord1265() {
		assertEquals("MA", customers.get(1264).getState());
	}

	@Test
	@DisplayName("Record 1265: ZIP is 1151")
	void ZIPOfRecord1265() {
		assertEquals("1151", customers.get(1264).getZIP());
	}

	@Test
	@DisplayName("Record 1265: Phone is 413-543-7955")
	void PhoneOfRecord1265() {
		assertEquals("413-543-7955", customers.get(1264).getPhone());
	}

	@Test
	@DisplayName("Record 1265: Fax is 413-543-7823")
	void FaxOfRecord1265() {
		assertEquals("413-543-7823", customers.get(1264).getFax());
	}

	@Test
	@DisplayName("Record 1265: Email is donovan@kuzel.com")
	void EmailOfRecord1265() {
		assertEquals("donovan@kuzel.com", customers.get(1264).getEmail());
	}

	@Test
	@DisplayName("Record 1265: Web is http://www.donovankuzel.com")
	void WebOfRecord1265() {
		assertEquals("http://www.donovankuzel.com", customers.get(1264).getWeb());
	}
}
