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
class Record_1994 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1994: FirstName is Hallie")
	void FirstNameOfRecord1994() {
		assertEquals("Hallie", customers.get(1993).getFirstName());
	}

	@Test
	@DisplayName("Record 1994: LastName is Voner")
	void LastNameOfRecord1994() {
		assertEquals("Voner", customers.get(1993).getLastName());
	}

	@Test
	@DisplayName("Record 1994: Company is Dailey, John J Esq")
	void CompanyOfRecord1994() {
		assertEquals("Dailey, John J Esq", customers.get(1993).getCompany());
	}

	@Test
	@DisplayName("Record 1994: Address is 2441 River Bend Rd")
	void AddressOfRecord1994() {
		assertEquals("2441 River Bend Rd", customers.get(1993).getAddress());
	}

	@Test
	@DisplayName("Record 1994: City is Plover")
	void CityOfRecord1994() {
		assertEquals("Plover", customers.get(1993).getCity());
	}

	@Test
	@DisplayName("Record 1994: County is Portage")
	void CountyOfRecord1994() {
		assertEquals("Portage", customers.get(1993).getCounty());
	}

	@Test
	@DisplayName("Record 1994: State is WI")
	void StateOfRecord1994() {
		assertEquals("WI", customers.get(1993).getState());
	}

	@Test
	@DisplayName("Record 1994: ZIP is 54467")
	void ZIPOfRecord1994() {
		assertEquals("54467", customers.get(1993).getZIP());
	}

	@Test
	@DisplayName("Record 1994: Phone is 715-341-5319")
	void PhoneOfRecord1994() {
		assertEquals("715-341-5319", customers.get(1993).getPhone());
	}

	@Test
	@DisplayName("Record 1994: Fax is 715-341-6757")
	void FaxOfRecord1994() {
		assertEquals("715-341-6757", customers.get(1993).getFax());
	}

	@Test
	@DisplayName("Record 1994: Email is hallie@voner.com")
	void EmailOfRecord1994() {
		assertEquals("hallie@voner.com", customers.get(1993).getEmail());
	}

	@Test
	@DisplayName("Record 1994: Web is http://www.hallievoner.com")
	void WebOfRecord1994() {
		assertEquals("http://www.hallievoner.com", customers.get(1993).getWeb());
	}
}
