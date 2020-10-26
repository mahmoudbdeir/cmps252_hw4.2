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

@Tag("32")
class Record_1914 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1914: FirstName is Carmen")
	void FirstNameOfRecord1914() {
		assertEquals("Carmen", customers.get(1913).getFirstName());
	}

	@Test
	@DisplayName("Record 1914: LastName is Prehym")
	void LastNameOfRecord1914() {
		assertEquals("Prehym", customers.get(1913).getLastName());
	}

	@Test
	@DisplayName("Record 1914: Company is Crawford, John Jr")
	void CompanyOfRecord1914() {
		assertEquals("Crawford, John Jr", customers.get(1913).getCompany());
	}

	@Test
	@DisplayName("Record 1914: Address is 5609 Fishers Ln  #-2a")
	void AddressOfRecord1914() {
		assertEquals("5609 Fishers Ln  #-2a", customers.get(1913).getAddress());
	}

	@Test
	@DisplayName("Record 1914: City is Rockville")
	void CityOfRecord1914() {
		assertEquals("Rockville", customers.get(1913).getCity());
	}

	@Test
	@DisplayName("Record 1914: County is Montgomery")
	void CountyOfRecord1914() {
		assertEquals("Montgomery", customers.get(1913).getCounty());
	}

	@Test
	@DisplayName("Record 1914: State is MD")
	void StateOfRecord1914() {
		assertEquals("MD", customers.get(1913).getState());
	}

	@Test
	@DisplayName("Record 1914: ZIP is 20852")
	void ZIPOfRecord1914() {
		assertEquals("20852", customers.get(1913).getZIP());
	}

	@Test
	@DisplayName("Record 1914: Phone is 301-770-0312")
	void PhoneOfRecord1914() {
		assertEquals("301-770-0312", customers.get(1913).getPhone());
	}

	@Test
	@DisplayName("Record 1914: Fax is 301-770-4616")
	void FaxOfRecord1914() {
		assertEquals("301-770-4616", customers.get(1913).getFax());
	}

	@Test
	@DisplayName("Record 1914: Email is carmen@prehym.com")
	void EmailOfRecord1914() {
		assertEquals("carmen@prehym.com", customers.get(1913).getEmail());
	}

	@Test
	@DisplayName("Record 1914: Web is http://www.carmenprehym.com")
	void WebOfRecord1914() {
		assertEquals("http://www.carmenprehym.com", customers.get(1913).getWeb());
	}
}
