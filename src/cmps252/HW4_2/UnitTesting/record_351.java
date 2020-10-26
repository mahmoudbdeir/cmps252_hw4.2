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

@Tag("37")
class Record_351 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 351: FirstName is Donald")
	void FirstNameOfRecord351() {
		assertEquals("Donald", customers.get(350).getFirstName());
	}

	@Test
	@DisplayName("Record 351: LastName is Klingenberger")
	void LastNameOfRecord351() {
		assertEquals("Klingenberger", customers.get(350).getLastName());
	}

	@Test
	@DisplayName("Record 351: Company is Hoffman, John D Esq")
	void CompanyOfRecord351() {
		assertEquals("Hoffman, John D Esq", customers.get(350).getCompany());
	}

	@Test
	@DisplayName("Record 351: Address is 4818 W Division St")
	void AddressOfRecord351() {
		assertEquals("4818 W Division St", customers.get(350).getAddress());
	}

	@Test
	@DisplayName("Record 351: City is Chicago")
	void CityOfRecord351() {
		assertEquals("Chicago", customers.get(350).getCity());
	}

	@Test
	@DisplayName("Record 351: County is Cook")
	void CountyOfRecord351() {
		assertEquals("Cook", customers.get(350).getCounty());
	}

	@Test
	@DisplayName("Record 351: State is IL")
	void StateOfRecord351() {
		assertEquals("IL", customers.get(350).getState());
	}

	@Test
	@DisplayName("Record 351: ZIP is 60651")
	void ZIPOfRecord351() {
		assertEquals("60651", customers.get(350).getZIP());
	}

	@Test
	@DisplayName("Record 351: Phone is 773-287-1767")
	void PhoneOfRecord351() {
		assertEquals("773-287-1767", customers.get(350).getPhone());
	}

	@Test
	@DisplayName("Record 351: Fax is 773-287-7503")
	void FaxOfRecord351() {
		assertEquals("773-287-7503", customers.get(350).getFax());
	}

	@Test
	@DisplayName("Record 351: Email is donald@klingenberger.com")
	void EmailOfRecord351() {
		assertEquals("donald@klingenberger.com", customers.get(350).getEmail());
	}

	@Test
	@DisplayName("Record 351: Web is http://www.donaldklingenberger.com")
	void WebOfRecord351() {
		assertEquals("http://www.donaldklingenberger.com", customers.get(350).getWeb());
	}
}
