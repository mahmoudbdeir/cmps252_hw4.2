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

@Tag("39")
class Record_4199 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4199: FirstName is Abbie")
	void FirstNameOfRecord4199() {
		assertEquals("Abbie", customers.get(4198).getFirstName());
	}

	@Test
	@DisplayName("Record 4199: LastName is Brennecke")
	void LastNameOfRecord4199() {
		assertEquals("Brennecke", customers.get(4198).getLastName());
	}

	@Test
	@DisplayName("Record 4199: Company is Wsae Pwr 107 Fm Chrstn Musc")
	void CompanyOfRecord4199() {
		assertEquals("Wsae Pwr 107 Fm Chrstn Musc", customers.get(4198).getCompany());
	}

	@Test
	@DisplayName("Record 4199: Address is 603 S Washington Ave")
	void AddressOfRecord4199() {
		assertEquals("603 S Washington Ave", customers.get(4198).getAddress());
	}

	@Test
	@DisplayName("Record 4199: City is Lansing")
	void CityOfRecord4199() {
		assertEquals("Lansing", customers.get(4198).getCity());
	}

	@Test
	@DisplayName("Record 4199: County is Ingham")
	void CountyOfRecord4199() {
		assertEquals("Ingham", customers.get(4198).getCounty());
	}

	@Test
	@DisplayName("Record 4199: State is MI")
	void StateOfRecord4199() {
		assertEquals("MI", customers.get(4198).getState());
	}

	@Test
	@DisplayName("Record 4199: ZIP is 48933")
	void ZIPOfRecord4199() {
		assertEquals("48933", customers.get(4198).getZIP());
	}

	@Test
	@DisplayName("Record 4199: Phone is 517-372-3986")
	void PhoneOfRecord4199() {
		assertEquals("517-372-3986", customers.get(4198).getPhone());
	}

	@Test
	@DisplayName("Record 4199: Fax is 517-372-7505")
	void FaxOfRecord4199() {
		assertEquals("517-372-7505", customers.get(4198).getFax());
	}

	@Test
	@DisplayName("Record 4199: Email is abbie@brennecke.com")
	void EmailOfRecord4199() {
		assertEquals("abbie@brennecke.com", customers.get(4198).getEmail());
	}

	@Test
	@DisplayName("Record 4199: Web is http://www.abbiebrennecke.com")
	void WebOfRecord4199() {
		assertEquals("http://www.abbiebrennecke.com", customers.get(4198).getWeb());
	}
}
