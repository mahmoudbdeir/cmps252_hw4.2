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
class Record_3236 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3236: FirstName is Wilmer")
	void FirstNameOfRecord3236() {
		assertEquals("Wilmer", customers.get(3235).getFirstName());
	}

	@Test
	@DisplayName("Record 3236: LastName is Birak")
	void LastNameOfRecord3236() {
		assertEquals("Birak", customers.get(3235).getLastName());
	}

	@Test
	@DisplayName("Record 3236: Company is Professional Sftwr Systs Inc")
	void CompanyOfRecord3236() {
		assertEquals("Professional Sftwr Systs Inc", customers.get(3235).getCompany());
	}

	@Test
	@DisplayName("Record 3236: Address is 2525 S Telshor Blvd  #-15202")
	void AddressOfRecord3236() {
		assertEquals("2525 S Telshor Blvd  #-15202", customers.get(3235).getAddress());
	}

	@Test
	@DisplayName("Record 3236: City is Las Cruces")
	void CityOfRecord3236() {
		assertEquals("Las Cruces", customers.get(3235).getCity());
	}

	@Test
	@DisplayName("Record 3236: County is Dona Ana")
	void CountyOfRecord3236() {
		assertEquals("Dona Ana", customers.get(3235).getCounty());
	}

	@Test
	@DisplayName("Record 3236: State is NM")
	void StateOfRecord3236() {
		assertEquals("NM", customers.get(3235).getState());
	}

	@Test
	@DisplayName("Record 3236: ZIP is 88011")
	void ZIPOfRecord3236() {
		assertEquals("88011", customers.get(3235).getZIP());
	}

	@Test
	@DisplayName("Record 3236: Phone is 505-522-6067")
	void PhoneOfRecord3236() {
		assertEquals("505-522-6067", customers.get(3235).getPhone());
	}

	@Test
	@DisplayName("Record 3236: Fax is 505-522-0053")
	void FaxOfRecord3236() {
		assertEquals("505-522-0053", customers.get(3235).getFax());
	}

	@Test
	@DisplayName("Record 3236: Email is wilmer@birak.com")
	void EmailOfRecord3236() {
		assertEquals("wilmer@birak.com", customers.get(3235).getEmail());
	}

	@Test
	@DisplayName("Record 3236: Web is http://www.wilmerbirak.com")
	void WebOfRecord3236() {
		assertEquals("http://www.wilmerbirak.com", customers.get(3235).getWeb());
	}
}
