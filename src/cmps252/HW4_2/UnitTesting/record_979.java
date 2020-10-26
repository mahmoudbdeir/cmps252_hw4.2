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

@Tag("45")
class Record_979 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 979: FirstName is Lenore")
	void FirstNameOfRecord979() {
		assertEquals("Lenore", customers.get(978).getFirstName());
	}

	@Test
	@DisplayName("Record 979: LastName is Chopra")
	void LastNameOfRecord979() {
		assertEquals("Chopra", customers.get(978).getLastName());
	}

	@Test
	@DisplayName("Record 979: Company is Internal Medicine Clinic")
	void CompanyOfRecord979() {
		assertEquals("Internal Medicine Clinic", customers.get(978).getCompany());
	}

	@Test
	@DisplayName("Record 979: Address is 1604 S 21st St")
	void AddressOfRecord979() {
		assertEquals("1604 S 21st St", customers.get(978).getAddress());
	}

	@Test
	@DisplayName("Record 979: City is Colorado Springs")
	void CityOfRecord979() {
		assertEquals("Colorado Springs", customers.get(978).getCity());
	}

	@Test
	@DisplayName("Record 979: County is El Paso")
	void CountyOfRecord979() {
		assertEquals("El Paso", customers.get(978).getCounty());
	}

	@Test
	@DisplayName("Record 979: State is CO")
	void StateOfRecord979() {
		assertEquals("CO", customers.get(978).getState());
	}

	@Test
	@DisplayName("Record 979: ZIP is 80904")
	void ZIPOfRecord979() {
		assertEquals("80904", customers.get(978).getZIP());
	}

	@Test
	@DisplayName("Record 979: Phone is 719-633-3890")
	void PhoneOfRecord979() {
		assertEquals("719-633-3890", customers.get(978).getPhone());
	}

	@Test
	@DisplayName("Record 979: Fax is 719-633-7744")
	void FaxOfRecord979() {
		assertEquals("719-633-7744", customers.get(978).getFax());
	}

	@Test
	@DisplayName("Record 979: Email is lenore@chopra.com")
	void EmailOfRecord979() {
		assertEquals("lenore@chopra.com", customers.get(978).getEmail());
	}

	@Test
	@DisplayName("Record 979: Web is http://www.lenorechopra.com")
	void WebOfRecord979() {
		assertEquals("http://www.lenorechopra.com", customers.get(978).getWeb());
	}
}
