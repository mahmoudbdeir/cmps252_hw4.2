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

@Tag("42")
class Record_2568 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2568: FirstName is Nelda")
	void FirstNameOfRecord2568() {
		assertEquals("Nelda", customers.get(2567).getFirstName());
	}

	@Test
	@DisplayName("Record 2568: LastName is Brisbin")
	void LastNameOfRecord2568() {
		assertEquals("Brisbin", customers.get(2567).getLastName());
	}

	@Test
	@DisplayName("Record 2568: Company is Goodson Newspaper Group")
	void CompanyOfRecord2568() {
		assertEquals("Goodson Newspaper Group", customers.get(2567).getCompany());
	}

	@Test
	@DisplayName("Record 2568: Address is 1860 Eastman Ave  #-103")
	void AddressOfRecord2568() {
		assertEquals("1860 Eastman Ave  #-103", customers.get(2567).getAddress());
	}

	@Test
	@DisplayName("Record 2568: City is Ventura")
	void CityOfRecord2568() {
		assertEquals("Ventura", customers.get(2567).getCity());
	}

	@Test
	@DisplayName("Record 2568: County is Ventura")
	void CountyOfRecord2568() {
		assertEquals("Ventura", customers.get(2567).getCounty());
	}

	@Test
	@DisplayName("Record 2568: State is CA")
	void StateOfRecord2568() {
		assertEquals("CA", customers.get(2567).getState());
	}

	@Test
	@DisplayName("Record 2568: ZIP is 93003")
	void ZIPOfRecord2568() {
		assertEquals("93003", customers.get(2567).getZIP());
	}

	@Test
	@DisplayName("Record 2568: Phone is 805-650-7197")
	void PhoneOfRecord2568() {
		assertEquals("805-650-7197", customers.get(2567).getPhone());
	}

	@Test
	@DisplayName("Record 2568: Fax is 805-650-0826")
	void FaxOfRecord2568() {
		assertEquals("805-650-0826", customers.get(2567).getFax());
	}

	@Test
	@DisplayName("Record 2568: Email is nelda@brisbin.com")
	void EmailOfRecord2568() {
		assertEquals("nelda@brisbin.com", customers.get(2567).getEmail());
	}

	@Test
	@DisplayName("Record 2568: Web is http://www.neldabrisbin.com")
	void WebOfRecord2568() {
		assertEquals("http://www.neldabrisbin.com", customers.get(2567).getWeb());
	}
}
