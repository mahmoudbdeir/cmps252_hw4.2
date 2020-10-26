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

@Tag("5")
class Record_2121 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2121: FirstName is Lou")
	void FirstNameOfRecord2121() {
		assertEquals("Lou", customers.get(2120).getFirstName());
	}

	@Test
	@DisplayName("Record 2121: LastName is Sayaphon")
	void LastNameOfRecord2121() {
		assertEquals("Sayaphon", customers.get(2120).getLastName());
	}

	@Test
	@DisplayName("Record 2121: Company is Manhattan Beer Distr Inc")
	void CompanyOfRecord2121() {
		assertEquals("Manhattan Beer Distr Inc", customers.get(2120).getCompany());
	}

	@Test
	@DisplayName("Record 2121: Address is 744 Pawling Ave")
	void AddressOfRecord2121() {
		assertEquals("744 Pawling Ave", customers.get(2120).getAddress());
	}

	@Test
	@DisplayName("Record 2121: City is Troy")
	void CityOfRecord2121() {
		assertEquals("Troy", customers.get(2120).getCity());
	}

	@Test
	@DisplayName("Record 2121: County is Rensselaer")
	void CountyOfRecord2121() {
		assertEquals("Rensselaer", customers.get(2120).getCounty());
	}

	@Test
	@DisplayName("Record 2121: State is NY")
	void StateOfRecord2121() {
		assertEquals("NY", customers.get(2120).getState());
	}

	@Test
	@DisplayName("Record 2121: ZIP is 12180")
	void ZIPOfRecord2121() {
		assertEquals("12180", customers.get(2120).getZIP());
	}

	@Test
	@DisplayName("Record 2121: Phone is 518-283-8661")
	void PhoneOfRecord2121() {
		assertEquals("518-283-8661", customers.get(2120).getPhone());
	}

	@Test
	@DisplayName("Record 2121: Fax is 518-283-4341")
	void FaxOfRecord2121() {
		assertEquals("518-283-4341", customers.get(2120).getFax());
	}

	@Test
	@DisplayName("Record 2121: Email is lou@sayaphon.com")
	void EmailOfRecord2121() {
		assertEquals("lou@sayaphon.com", customers.get(2120).getEmail());
	}

	@Test
	@DisplayName("Record 2121: Web is http://www.lousayaphon.com")
	void WebOfRecord2121() {
		assertEquals("http://www.lousayaphon.com", customers.get(2120).getWeb());
	}
}
