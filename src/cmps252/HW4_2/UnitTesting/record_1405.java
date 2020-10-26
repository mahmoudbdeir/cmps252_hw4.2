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

@Tag("19")
class Record_1405 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1405: FirstName is Fryda")
	void FirstNameOfRecord1405() {
		assertEquals("Fryda", customers.get(1404).getFirstName());
	}

	@Test
	@DisplayName("Record 1405: LastName is Limke")
	void LastNameOfRecord1405() {
		assertEquals("Limke", customers.get(1404).getLastName());
	}

	@Test
	@DisplayName("Record 1405: Company is Evers, William D Esq")
	void CompanyOfRecord1405() {
		assertEquals("Evers, William D Esq", customers.get(1404).getCompany());
	}

	@Test
	@DisplayName("Record 1405: Address is 5050 France Ave S  #-240")
	void AddressOfRecord1405() {
		assertEquals("5050 France Ave S  #-240", customers.get(1404).getAddress());
	}

	@Test
	@DisplayName("Record 1405: City is Minneapolis")
	void CityOfRecord1405() {
		assertEquals("Minneapolis", customers.get(1404).getCity());
	}

	@Test
	@DisplayName("Record 1405: County is Hennepin")
	void CountyOfRecord1405() {
		assertEquals("Hennepin", customers.get(1404).getCounty());
	}

	@Test
	@DisplayName("Record 1405: State is MN")
	void StateOfRecord1405() {
		assertEquals("MN", customers.get(1404).getState());
	}

	@Test
	@DisplayName("Record 1405: ZIP is 55410")
	void ZIPOfRecord1405() {
		assertEquals("55410", customers.get(1404).getZIP());
	}

	@Test
	@DisplayName("Record 1405: Phone is 612-922-9002")
	void PhoneOfRecord1405() {
		assertEquals("612-922-9002", customers.get(1404).getPhone());
	}

	@Test
	@DisplayName("Record 1405: Fax is 612-922-3178")
	void FaxOfRecord1405() {
		assertEquals("612-922-3178", customers.get(1404).getFax());
	}

	@Test
	@DisplayName("Record 1405: Email is fryda@limke.com")
	void EmailOfRecord1405() {
		assertEquals("fryda@limke.com", customers.get(1404).getEmail());
	}

	@Test
	@DisplayName("Record 1405: Web is http://www.frydalimke.com")
	void WebOfRecord1405() {
		assertEquals("http://www.frydalimke.com", customers.get(1404).getWeb());
	}
}
