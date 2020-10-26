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

@Tag("25")
class Record_482 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 482: FirstName is Ester")
	void FirstNameOfRecord482() {
		assertEquals("Ester", customers.get(481).getFirstName());
	}

	@Test
	@DisplayName("Record 482: LastName is Kame")
	void LastNameOfRecord482() {
		assertEquals("Kame", customers.get(481).getLastName());
	}

	@Test
	@DisplayName("Record 482: Company is Vosburg, Bruce D Esq")
	void CompanyOfRecord482() {
		assertEquals("Vosburg, Bruce D Esq", customers.get(481).getCompany());
	}

	@Test
	@DisplayName("Record 482: Address is Gardner")
	void AddressOfRecord482() {
		assertEquals("Gardner", customers.get(481).getAddress());
	}

	@Test
	@DisplayName("Record 482: City is Port Jervis")
	void CityOfRecord482() {
		assertEquals("Port Jervis", customers.get(481).getCity());
	}

	@Test
	@DisplayName("Record 482: County is Orange")
	void CountyOfRecord482() {
		assertEquals("Orange", customers.get(481).getCounty());
	}

	@Test
	@DisplayName("Record 482: State is NY")
	void StateOfRecord482() {
		assertEquals("NY", customers.get(481).getState());
	}

	@Test
	@DisplayName("Record 482: ZIP is 12771")
	void ZIPOfRecord482() {
		assertEquals("12771", customers.get(481).getZIP());
	}

	@Test
	@DisplayName("Record 482: Phone is 845-856-9914")
	void PhoneOfRecord482() {
		assertEquals("845-856-9914", customers.get(481).getPhone());
	}

	@Test
	@DisplayName("Record 482: Fax is 845-856-8755")
	void FaxOfRecord482() {
		assertEquals("845-856-8755", customers.get(481).getFax());
	}

	@Test
	@DisplayName("Record 482: Email is ester@kame.com")
	void EmailOfRecord482() {
		assertEquals("ester@kame.com", customers.get(481).getEmail());
	}

	@Test
	@DisplayName("Record 482: Web is http://www.esterkame.com")
	void WebOfRecord482() {
		assertEquals("http://www.esterkame.com", customers.get(481).getWeb());
	}
}
