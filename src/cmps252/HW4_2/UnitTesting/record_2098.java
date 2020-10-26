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
class Record_2098 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2098: FirstName is Debora")
	void FirstNameOfRecord2098() {
		assertEquals("Debora", customers.get(2097).getFirstName());
	}

	@Test
	@DisplayName("Record 2098: LastName is Dildy")
	void LastNameOfRecord2098() {
		assertEquals("Dildy", customers.get(2097).getLastName());
	}

	@Test
	@DisplayName("Record 2098: Company is Control Graphics")
	void CompanyOfRecord2098() {
		assertEquals("Control Graphics", customers.get(2097).getCompany());
	}

	@Test
	@DisplayName("Record 2098: Address is 16004 Aurora Ave N")
	void AddressOfRecord2098() {
		assertEquals("16004 Aurora Ave N", customers.get(2097).getAddress());
	}

	@Test
	@DisplayName("Record 2098: City is Seattle")
	void CityOfRecord2098() {
		assertEquals("Seattle", customers.get(2097).getCity());
	}

	@Test
	@DisplayName("Record 2098: County is King")
	void CountyOfRecord2098() {
		assertEquals("King", customers.get(2097).getCounty());
	}

	@Test
	@DisplayName("Record 2098: State is WA")
	void StateOfRecord2098() {
		assertEquals("WA", customers.get(2097).getState());
	}

	@Test
	@DisplayName("Record 2098: ZIP is 98133")
	void ZIPOfRecord2098() {
		assertEquals("98133", customers.get(2097).getZIP());
	}

	@Test
	@DisplayName("Record 2098: Phone is 206-367-8851")
	void PhoneOfRecord2098() {
		assertEquals("206-367-8851", customers.get(2097).getPhone());
	}

	@Test
	@DisplayName("Record 2098: Fax is 206-367-0793")
	void FaxOfRecord2098() {
		assertEquals("206-367-0793", customers.get(2097).getFax());
	}

	@Test
	@DisplayName("Record 2098: Email is debora@dildy.com")
	void EmailOfRecord2098() {
		assertEquals("debora@dildy.com", customers.get(2097).getEmail());
	}

	@Test
	@DisplayName("Record 2098: Web is http://www.deboradildy.com")
	void WebOfRecord2098() {
		assertEquals("http://www.deboradildy.com", customers.get(2097).getWeb());
	}
}
