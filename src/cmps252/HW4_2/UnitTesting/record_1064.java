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

@Tag("33")
class Record_1064 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1064: FirstName is Lilia")
	void FirstNameOfRecord1064() {
		assertEquals("Lilia", customers.get(1063).getFirstName());
	}

	@Test
	@DisplayName("Record 1064: LastName is Boria")
	void LastNameOfRecord1064() {
		assertEquals("Boria", customers.get(1063).getLastName());
	}

	@Test
	@DisplayName("Record 1064: Company is Bottle & Basket Shoppe")
	void CompanyOfRecord1064() {
		assertEquals("Bottle & Basket Shoppe", customers.get(1063).getCompany());
	}

	@Test
	@DisplayName("Record 1064: Address is 19 Bala Ave")
	void AddressOfRecord1064() {
		assertEquals("19 Bala Ave", customers.get(1063).getAddress());
	}

	@Test
	@DisplayName("Record 1064: City is Bala Cynwyd")
	void CityOfRecord1064() {
		assertEquals("Bala Cynwyd", customers.get(1063).getCity());
	}

	@Test
	@DisplayName("Record 1064: County is Montgomery")
	void CountyOfRecord1064() {
		assertEquals("Montgomery", customers.get(1063).getCounty());
	}

	@Test
	@DisplayName("Record 1064: State is PA")
	void StateOfRecord1064() {
		assertEquals("PA", customers.get(1063).getState());
	}

	@Test
	@DisplayName("Record 1064: ZIP is 19004")
	void ZIPOfRecord1064() {
		assertEquals("19004", customers.get(1063).getZIP());
	}

	@Test
	@DisplayName("Record 1064: Phone is 610-664-3068")
	void PhoneOfRecord1064() {
		assertEquals("610-664-3068", customers.get(1063).getPhone());
	}

	@Test
	@DisplayName("Record 1064: Fax is 610-664-4586")
	void FaxOfRecord1064() {
		assertEquals("610-664-4586", customers.get(1063).getFax());
	}

	@Test
	@DisplayName("Record 1064: Email is lilia@boria.com")
	void EmailOfRecord1064() {
		assertEquals("lilia@boria.com", customers.get(1063).getEmail());
	}

	@Test
	@DisplayName("Record 1064: Web is http://www.liliaboria.com")
	void WebOfRecord1064() {
		assertEquals("http://www.liliaboria.com", customers.get(1063).getWeb());
	}
}
