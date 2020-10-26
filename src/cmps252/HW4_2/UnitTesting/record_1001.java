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

@Tag("44")
class Record_1001 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1001: FirstName is Robert")
	void FirstNameOfRecord1001() {
		assertEquals("Robert", customers.get(1000).getFirstName());
	}

	@Test
	@DisplayName("Record 1001: LastName is Yotter")
	void LastNameOfRecord1001() {
		assertEquals("Yotter", customers.get(1000).getLastName());
	}

	@Test
	@DisplayName("Record 1001: Company is Schimbor, Patricia S Esq")
	void CompanyOfRecord1001() {
		assertEquals("Schimbor, Patricia S Esq", customers.get(1000).getCompany());
	}

	@Test
	@DisplayName("Record 1001: Address is 27332 Van Dyke Ave")
	void AddressOfRecord1001() {
		assertEquals("27332 Van Dyke Ave", customers.get(1000).getAddress());
	}

	@Test
	@DisplayName("Record 1001: City is Warren")
	void CityOfRecord1001() {
		assertEquals("Warren", customers.get(1000).getCity());
	}

	@Test
	@DisplayName("Record 1001: County is Macomb")
	void CountyOfRecord1001() {
		assertEquals("Macomb", customers.get(1000).getCounty());
	}

	@Test
	@DisplayName("Record 1001: State is MI")
	void StateOfRecord1001() {
		assertEquals("MI", customers.get(1000).getState());
	}

	@Test
	@DisplayName("Record 1001: ZIP is 48093")
	void ZIPOfRecord1001() {
		assertEquals("48093", customers.get(1000).getZIP());
	}

	@Test
	@DisplayName("Record 1001: Phone is 586-758-0391")
	void PhoneOfRecord1001() {
		assertEquals("586-758-0391", customers.get(1000).getPhone());
	}

	@Test
	@DisplayName("Record 1001: Fax is 586-758-2226")
	void FaxOfRecord1001() {
		assertEquals("586-758-2226", customers.get(1000).getFax());
	}

	@Test
	@DisplayName("Record 1001: Email is robert@yotter.com")
	void EmailOfRecord1001() {
		assertEquals("robert@yotter.com", customers.get(1000).getEmail());
	}

	@Test
	@DisplayName("Record 1001: Web is http://www.robertyotter.com")
	void WebOfRecord1001() {
		assertEquals("http://www.robertyotter.com", customers.get(1000).getWeb());
	}
}
