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

@Tag("32")
class Record_391 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 391: FirstName is Micah")
	void FirstNameOfRecord391() {
		assertEquals("Micah", customers.get(390).getFirstName());
	}

	@Test
	@DisplayName("Record 391: LastName is Dollen")
	void LastNameOfRecord391() {
		assertEquals("Dollen", customers.get(390).getLastName());
	}

	@Test
	@DisplayName("Record 391: Company is Sonnier, Charles R Esq")
	void CompanyOfRecord391() {
		assertEquals("Sonnier, Charles R Esq", customers.get(390).getCompany());
	}

	@Test
	@DisplayName("Record 391: Address is 22 Garfield Way")
	void AddressOfRecord391() {
		assertEquals("22 Garfield Way", customers.get(390).getAddress());
	}

	@Test
	@DisplayName("Record 391: City is Newark")
	void CityOfRecord391() {
		assertEquals("Newark", customers.get(390).getCity());
	}

	@Test
	@DisplayName("Record 391: County is New Castle")
	void CountyOfRecord391() {
		assertEquals("New Castle", customers.get(390).getCounty());
	}

	@Test
	@DisplayName("Record 391: State is DE")
	void StateOfRecord391() {
		assertEquals("DE", customers.get(390).getState());
	}

	@Test
	@DisplayName("Record 391: ZIP is 19713")
	void ZIPOfRecord391() {
		assertEquals("19713", customers.get(390).getZIP());
	}

	@Test
	@DisplayName("Record 391: Phone is 302-737-3759")
	void PhoneOfRecord391() {
		assertEquals("302-737-3759", customers.get(390).getPhone());
	}

	@Test
	@DisplayName("Record 391: Fax is 302-737-8341")
	void FaxOfRecord391() {
		assertEquals("302-737-8341", customers.get(390).getFax());
	}

	@Test
	@DisplayName("Record 391: Email is micah@dollen.com")
	void EmailOfRecord391() {
		assertEquals("micah@dollen.com", customers.get(390).getEmail());
	}

	@Test
	@DisplayName("Record 391: Web is http://www.micahdollen.com")
	void WebOfRecord391() {
		assertEquals("http://www.micahdollen.com", customers.get(390).getWeb());
	}
}
