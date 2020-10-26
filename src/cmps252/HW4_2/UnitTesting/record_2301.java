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

@Tag("10")
class Record_2301 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2301: FirstName is Antwan")
	void FirstNameOfRecord2301() {
		assertEquals("Antwan", customers.get(2300).getFirstName());
	}

	@Test
	@DisplayName("Record 2301: LastName is Poissant")
	void LastNameOfRecord2301() {
		assertEquals("Poissant", customers.get(2300).getLastName());
	}

	@Test
	@DisplayName("Record 2301: Company is Elite International Corp")
	void CompanyOfRecord2301() {
		assertEquals("Elite International Corp", customers.get(2300).getCompany());
	}

	@Test
	@DisplayName("Record 2301: Address is 1 Bridge Plz  #-105")
	void AddressOfRecord2301() {
		assertEquals("1 Bridge Plz  #-105", customers.get(2300).getAddress());
	}

	@Test
	@DisplayName("Record 2301: City is Fort Lee")
	void CityOfRecord2301() {
		assertEquals("Fort Lee", customers.get(2300).getCity());
	}

	@Test
	@DisplayName("Record 2301: County is Bergen")
	void CountyOfRecord2301() {
		assertEquals("Bergen", customers.get(2300).getCounty());
	}

	@Test
	@DisplayName("Record 2301: State is NJ")
	void StateOfRecord2301() {
		assertEquals("NJ", customers.get(2300).getState());
	}

	@Test
	@DisplayName("Record 2301: ZIP is 7024")
	void ZIPOfRecord2301() {
		assertEquals("7024", customers.get(2300).getZIP());
	}

	@Test
	@DisplayName("Record 2301: Phone is 201-947-2315")
	void PhoneOfRecord2301() {
		assertEquals("201-947-2315", customers.get(2300).getPhone());
	}

	@Test
	@DisplayName("Record 2301: Fax is 201-947-9397")
	void FaxOfRecord2301() {
		assertEquals("201-947-9397", customers.get(2300).getFax());
	}

	@Test
	@DisplayName("Record 2301: Email is antwan@poissant.com")
	void EmailOfRecord2301() {
		assertEquals("antwan@poissant.com", customers.get(2300).getEmail());
	}

	@Test
	@DisplayName("Record 2301: Web is http://www.antwanpoissant.com")
	void WebOfRecord2301() {
		assertEquals("http://www.antwanpoissant.com", customers.get(2300).getWeb());
	}
}
