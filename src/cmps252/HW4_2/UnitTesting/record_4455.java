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
class Record_4455 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4455: FirstName is Willy")
	void FirstNameOfRecord4455() {
		assertEquals("Willy", customers.get(4454).getFirstName());
	}

	@Test
	@DisplayName("Record 4455: LastName is Fasheh")
	void LastNameOfRecord4455() {
		assertEquals("Fasheh", customers.get(4454).getLastName());
	}

	@Test
	@DisplayName("Record 4455: Company is Bailey, Deborah L Esq")
	void CompanyOfRecord4455() {
		assertEquals("Bailey, Deborah L Esq", customers.get(4454).getCompany());
	}

	@Test
	@DisplayName("Record 4455: Address is 140 S Grandview Ave")
	void AddressOfRecord4455() {
		assertEquals("140 S Grandview Ave", customers.get(4454).getAddress());
	}

	@Test
	@DisplayName("Record 4455: City is Daytona Beach")
	void CityOfRecord4455() {
		assertEquals("Daytona Beach", customers.get(4454).getCity());
	}

	@Test
	@DisplayName("Record 4455: County is Volusia")
	void CountyOfRecord4455() {
		assertEquals("Volusia", customers.get(4454).getCounty());
	}

	@Test
	@DisplayName("Record 4455: State is FL")
	void StateOfRecord4455() {
		assertEquals("FL", customers.get(4454).getState());
	}

	@Test
	@DisplayName("Record 4455: ZIP is 32118")
	void ZIPOfRecord4455() {
		assertEquals("32118", customers.get(4454).getZIP());
	}

	@Test
	@DisplayName("Record 4455: Phone is 386-255-7870")
	void PhoneOfRecord4455() {
		assertEquals("386-255-7870", customers.get(4454).getPhone());
	}

	@Test
	@DisplayName("Record 4455: Fax is 386-255-7737")
	void FaxOfRecord4455() {
		assertEquals("386-255-7737", customers.get(4454).getFax());
	}

	@Test
	@DisplayName("Record 4455: Email is willy@fasheh.com")
	void EmailOfRecord4455() {
		assertEquals("willy@fasheh.com", customers.get(4454).getEmail());
	}

	@Test
	@DisplayName("Record 4455: Web is http://www.willyfasheh.com")
	void WebOfRecord4455() {
		assertEquals("http://www.willyfasheh.com", customers.get(4454).getWeb());
	}
}
