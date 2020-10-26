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

@Tag("4")
class Record_3865 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3865: FirstName is Ava")
	void FirstNameOfRecord3865() {
		assertEquals("Ava", customers.get(3864).getFirstName());
	}

	@Test
	@DisplayName("Record 3865: LastName is Knysel")
	void LastNameOfRecord3865() {
		assertEquals("Knysel", customers.get(3864).getLastName());
	}

	@Test
	@DisplayName("Record 3865: Company is Package Pavement Co Inc")
	void CompanyOfRecord3865() {
		assertEquals("Package Pavement Co Inc", customers.get(3864).getCompany());
	}

	@Test
	@DisplayName("Record 3865: Address is 701 S Main St")
	void AddressOfRecord3865() {
		assertEquals("701 S Main St", customers.get(3864).getAddress());
	}

	@Test
	@DisplayName("Record 3865: City is Wilkes Barre")
	void CityOfRecord3865() {
		assertEquals("Wilkes Barre", customers.get(3864).getCity());
	}

	@Test
	@DisplayName("Record 3865: County is Luzerne")
	void CountyOfRecord3865() {
		assertEquals("Luzerne", customers.get(3864).getCounty());
	}

	@Test
	@DisplayName("Record 3865: State is PA")
	void StateOfRecord3865() {
		assertEquals("PA", customers.get(3864).getState());
	}

	@Test
	@DisplayName("Record 3865: ZIP is 18702")
	void ZIPOfRecord3865() {
		assertEquals("18702", customers.get(3864).getZIP());
	}

	@Test
	@DisplayName("Record 3865: Phone is 570-822-6450")
	void PhoneOfRecord3865() {
		assertEquals("570-822-6450", customers.get(3864).getPhone());
	}

	@Test
	@DisplayName("Record 3865: Fax is 570-822-3906")
	void FaxOfRecord3865() {
		assertEquals("570-822-3906", customers.get(3864).getFax());
	}

	@Test
	@DisplayName("Record 3865: Email is ava@knysel.com")
	void EmailOfRecord3865() {
		assertEquals("ava@knysel.com", customers.get(3864).getEmail());
	}

	@Test
	@DisplayName("Record 3865: Web is http://www.avaknysel.com")
	void WebOfRecord3865() {
		assertEquals("http://www.avaknysel.com", customers.get(3864).getWeb());
	}
}
