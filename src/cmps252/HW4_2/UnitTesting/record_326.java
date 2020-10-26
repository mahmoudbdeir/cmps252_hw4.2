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
class Record_326 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 326: FirstName is Josie")
	void FirstNameOfRecord326() {
		assertEquals("Josie", customers.get(325).getFirstName());
	}

	@Test
	@DisplayName("Record 326: LastName is Dobkowski")
	void LastNameOfRecord326() {
		assertEquals("Dobkowski", customers.get(325).getLastName());
	}

	@Test
	@DisplayName("Record 326: Company is Vac U Pack Inc")
	void CompanyOfRecord326() {
		assertEquals("Vac U Pack Inc", customers.get(325).getCompany());
	}

	@Test
	@DisplayName("Record 326: Address is 2726 Gunnison St")
	void AddressOfRecord326() {
		assertEquals("2726 Gunnison St", customers.get(325).getAddress());
	}

	@Test
	@DisplayName("Record 326: City is Colorado Springs")
	void CityOfRecord326() {
		assertEquals("Colorado Springs", customers.get(325).getCity());
	}

	@Test
	@DisplayName("Record 326: County is El Paso")
	void CountyOfRecord326() {
		assertEquals("El Paso", customers.get(325).getCounty());
	}

	@Test
	@DisplayName("Record 326: State is CO")
	void StateOfRecord326() {
		assertEquals("CO", customers.get(325).getState());
	}

	@Test
	@DisplayName("Record 326: ZIP is 80909")
	void ZIPOfRecord326() {
		assertEquals("80909", customers.get(325).getZIP());
	}

	@Test
	@DisplayName("Record 326: Phone is 719-634-4462")
	void PhoneOfRecord326() {
		assertEquals("719-634-4462", customers.get(325).getPhone());
	}

	@Test
	@DisplayName("Record 326: Fax is 719-634-0943")
	void FaxOfRecord326() {
		assertEquals("719-634-0943", customers.get(325).getFax());
	}

	@Test
	@DisplayName("Record 326: Email is josie@dobkowski.com")
	void EmailOfRecord326() {
		assertEquals("josie@dobkowski.com", customers.get(325).getEmail());
	}

	@Test
	@DisplayName("Record 326: Web is http://www.josiedobkowski.com")
	void WebOfRecord326() {
		assertEquals("http://www.josiedobkowski.com", customers.get(325).getWeb());
	}
}
