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
class Record_4555 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4555: FirstName is Carlos")
	void FirstNameOfRecord4555() {
		assertEquals("Carlos", customers.get(4554).getFirstName());
	}

	@Test
	@DisplayName("Record 4555: LastName is School")
	void LastNameOfRecord4555() {
		assertEquals("School", customers.get(4554).getLastName());
	}

	@Test
	@DisplayName("Record 4555: Company is Elwyn Inc")
	void CompanyOfRecord4555() {
		assertEquals("Elwyn Inc", customers.get(4554).getCompany());
	}

	@Test
	@DisplayName("Record 4555: Address is 2750 S Hardy Dr")
	void AddressOfRecord4555() {
		assertEquals("2750 S Hardy Dr", customers.get(4554).getAddress());
	}

	@Test
	@DisplayName("Record 4555: City is Tempe")
	void CityOfRecord4555() {
		assertEquals("Tempe", customers.get(4554).getCity());
	}

	@Test
	@DisplayName("Record 4555: County is Maricopa")
	void CountyOfRecord4555() {
		assertEquals("Maricopa", customers.get(4554).getCounty());
	}

	@Test
	@DisplayName("Record 4555: State is AZ")
	void StateOfRecord4555() {
		assertEquals("AZ", customers.get(4554).getState());
	}

	@Test
	@DisplayName("Record 4555: ZIP is 85282")
	void ZIPOfRecord4555() {
		assertEquals("85282", customers.get(4554).getZIP());
	}

	@Test
	@DisplayName("Record 4555: Phone is 480-966-8037")
	void PhoneOfRecord4555() {
		assertEquals("480-966-8037", customers.get(4554).getPhone());
	}

	@Test
	@DisplayName("Record 4555: Fax is 480-966-0231")
	void FaxOfRecord4555() {
		assertEquals("480-966-0231", customers.get(4554).getFax());
	}

	@Test
	@DisplayName("Record 4555: Email is carlos@school.com")
	void EmailOfRecord4555() {
		assertEquals("carlos@school.com", customers.get(4554).getEmail());
	}

	@Test
	@DisplayName("Record 4555: Web is http://www.carlosschool.com")
	void WebOfRecord4555() {
		assertEquals("http://www.carlosschool.com", customers.get(4554).getWeb());
	}
}
