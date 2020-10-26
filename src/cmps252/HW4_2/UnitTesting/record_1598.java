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

@Tag("16")
class Record_1598 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1598: FirstName is Benita")
	void FirstNameOfRecord1598() {
		assertEquals("Benita", customers.get(1597).getFirstName());
	}

	@Test
	@DisplayName("Record 1598: LastName is Rehbyn")
	void LastNameOfRecord1598() {
		assertEquals("Rehbyn", customers.get(1597).getLastName());
	}

	@Test
	@DisplayName("Record 1598: Company is Bays, Ray Esq")
	void CompanyOfRecord1598() {
		assertEquals("Bays, Ray Esq", customers.get(1597).getCompany());
	}

	@Test
	@DisplayName("Record 1598: Address is 26555 Evergreen Rd")
	void AddressOfRecord1598() {
		assertEquals("26555 Evergreen Rd", customers.get(1597).getAddress());
	}

	@Test
	@DisplayName("Record 1598: City is Southfield")
	void CityOfRecord1598() {
		assertEquals("Southfield", customers.get(1597).getCity());
	}

	@Test
	@DisplayName("Record 1598: County is Oakland")
	void CountyOfRecord1598() {
		assertEquals("Oakland", customers.get(1597).getCounty());
	}

	@Test
	@DisplayName("Record 1598: State is MI")
	void StateOfRecord1598() {
		assertEquals("MI", customers.get(1597).getState());
	}

	@Test
	@DisplayName("Record 1598: ZIP is 48076")
	void ZIPOfRecord1598() {
		assertEquals("48076", customers.get(1597).getZIP());
	}

	@Test
	@DisplayName("Record 1598: Phone is 248-948-9072")
	void PhoneOfRecord1598() {
		assertEquals("248-948-9072", customers.get(1597).getPhone());
	}

	@Test
	@DisplayName("Record 1598: Fax is 248-948-0304")
	void FaxOfRecord1598() {
		assertEquals("248-948-0304", customers.get(1597).getFax());
	}

	@Test
	@DisplayName("Record 1598: Email is benita@rehbyn.com")
	void EmailOfRecord1598() {
		assertEquals("benita@rehbyn.com", customers.get(1597).getEmail());
	}

	@Test
	@DisplayName("Record 1598: Web is http://www.benitarehbyn.com")
	void WebOfRecord1598() {
		assertEquals("http://www.benitarehbyn.com", customers.get(1597).getWeb());
	}
}
