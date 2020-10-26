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

@Tag("17")
class Record_804 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 804: FirstName is Dyrdre")
	void FirstNameOfRecord804() {
		assertEquals("Dyrdre", customers.get(803).getFirstName());
	}

	@Test
	@DisplayName("Record 804: LastName is Croutch")
	void LastNameOfRecord804() {
		assertEquals("Croutch", customers.get(803).getLastName());
	}

	@Test
	@DisplayName("Record 804: Company is Beard, Don L Esq")
	void CompanyOfRecord804() {
		assertEquals("Beard, Don L Esq", customers.get(803).getCompany());
	}

	@Test
	@DisplayName("Record 804: Address is 4118 S Salina St")
	void AddressOfRecord804() {
		assertEquals("4118 S Salina St", customers.get(803).getAddress());
	}

	@Test
	@DisplayName("Record 804: City is Syracuse")
	void CityOfRecord804() {
		assertEquals("Syracuse", customers.get(803).getCity());
	}

	@Test
	@DisplayName("Record 804: County is Onondaga")
	void CountyOfRecord804() {
		assertEquals("Onondaga", customers.get(803).getCounty());
	}

	@Test
	@DisplayName("Record 804: State is NY")
	void StateOfRecord804() {
		assertEquals("NY", customers.get(803).getState());
	}

	@Test
	@DisplayName("Record 804: ZIP is 13205")
	void ZIPOfRecord804() {
		assertEquals("13205", customers.get(803).getZIP());
	}

	@Test
	@DisplayName("Record 804: Phone is 315-492-4265")
	void PhoneOfRecord804() {
		assertEquals("315-492-4265", customers.get(803).getPhone());
	}

	@Test
	@DisplayName("Record 804: Fax is 315-492-6767")
	void FaxOfRecord804() {
		assertEquals("315-492-6767", customers.get(803).getFax());
	}

	@Test
	@DisplayName("Record 804: Email is dyrdre@croutch.com")
	void EmailOfRecord804() {
		assertEquals("dyrdre@croutch.com", customers.get(803).getEmail());
	}

	@Test
	@DisplayName("Record 804: Web is http://www.dyrdrecroutch.com")
	void WebOfRecord804() {
		assertEquals("http://www.dyrdrecroutch.com", customers.get(803).getWeb());
	}
}
