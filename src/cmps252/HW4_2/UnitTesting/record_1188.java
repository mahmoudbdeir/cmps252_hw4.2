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

@Tag("48")
class Record_1188 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1188: FirstName is Aimee")
	void FirstNameOfRecord1188() {
		assertEquals("Aimee", customers.get(1187).getFirstName());
	}

	@Test
	@DisplayName("Record 1188: LastName is Bushart")
	void LastNameOfRecord1188() {
		assertEquals("Bushart", customers.get(1187).getLastName());
	}

	@Test
	@DisplayName("Record 1188: Company is Martin, Robert H Esq")
	void CompanyOfRecord1188() {
		assertEquals("Martin, Robert H Esq", customers.get(1187).getCompany());
	}

	@Test
	@DisplayName("Record 1188: Address is 327 Chartres St")
	void AddressOfRecord1188() {
		assertEquals("327 Chartres St", customers.get(1187).getAddress());
	}

	@Test
	@DisplayName("Record 1188: City is New Orleans")
	void CityOfRecord1188() {
		assertEquals("New Orleans", customers.get(1187).getCity());
	}

	@Test
	@DisplayName("Record 1188: County is Orleans")
	void CountyOfRecord1188() {
		assertEquals("Orleans", customers.get(1187).getCounty());
	}

	@Test
	@DisplayName("Record 1188: State is LA")
	void StateOfRecord1188() {
		assertEquals("LA", customers.get(1187).getState());
	}

	@Test
	@DisplayName("Record 1188: ZIP is 70130")
	void ZIPOfRecord1188() {
		assertEquals("70130", customers.get(1187).getZIP());
	}

	@Test
	@DisplayName("Record 1188: Phone is 504-581-7068")
	void PhoneOfRecord1188() {
		assertEquals("504-581-7068", customers.get(1187).getPhone());
	}

	@Test
	@DisplayName("Record 1188: Fax is 504-581-0686")
	void FaxOfRecord1188() {
		assertEquals("504-581-0686", customers.get(1187).getFax());
	}

	@Test
	@DisplayName("Record 1188: Email is aimee@bushart.com")
	void EmailOfRecord1188() {
		assertEquals("aimee@bushart.com", customers.get(1187).getEmail());
	}

	@Test
	@DisplayName("Record 1188: Web is http://www.aimeebushart.com")
	void WebOfRecord1188() {
		assertEquals("http://www.aimeebushart.com", customers.get(1187).getWeb());
	}
}
