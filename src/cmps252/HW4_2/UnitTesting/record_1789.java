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

@Tag("24")
class Record_1789 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1789: FirstName is Dillon")
	void FirstNameOfRecord1789() {
		assertEquals("Dillon", customers.get(1788).getFirstName());
	}

	@Test
	@DisplayName("Record 1789: LastName is Grahl")
	void LastNameOfRecord1789() {
		assertEquals("Grahl", customers.get(1788).getLastName());
	}

	@Test
	@DisplayName("Record 1789: Company is Suthers, John E Esq")
	void CompanyOfRecord1789() {
		assertEquals("Suthers, John E Esq", customers.get(1788).getCompany());
	}

	@Test
	@DisplayName("Record 1789: Address is 1712 Walnut St")
	void AddressOfRecord1789() {
		assertEquals("1712 Walnut St", customers.get(1788).getAddress());
	}

	@Test
	@DisplayName("Record 1789: City is Philadelphia")
	void CityOfRecord1789() {
		assertEquals("Philadelphia", customers.get(1788).getCity());
	}

	@Test
	@DisplayName("Record 1789: County is Philadelphia")
	void CountyOfRecord1789() {
		assertEquals("Philadelphia", customers.get(1788).getCounty());
	}

	@Test
	@DisplayName("Record 1789: State is PA")
	void StateOfRecord1789() {
		assertEquals("PA", customers.get(1788).getState());
	}

	@Test
	@DisplayName("Record 1789: ZIP is 19103")
	void ZIPOfRecord1789() {
		assertEquals("19103", customers.get(1788).getZIP());
	}

	@Test
	@DisplayName("Record 1789: Phone is 215-731-5535")
	void PhoneOfRecord1789() {
		assertEquals("215-731-5535", customers.get(1788).getPhone());
	}

	@Test
	@DisplayName("Record 1789: Fax is 215-731-9323")
	void FaxOfRecord1789() {
		assertEquals("215-731-9323", customers.get(1788).getFax());
	}

	@Test
	@DisplayName("Record 1789: Email is dillon@grahl.com")
	void EmailOfRecord1789() {
		assertEquals("dillon@grahl.com", customers.get(1788).getEmail());
	}

	@Test
	@DisplayName("Record 1789: Web is http://www.dillongrahl.com")
	void WebOfRecord1789() {
		assertEquals("http://www.dillongrahl.com", customers.get(1788).getWeb());
	}
}
