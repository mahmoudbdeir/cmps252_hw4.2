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

@Tag("25")
class Record_2041 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2041: FirstName is Alva")
	void FirstNameOfRecord2041() {
		assertEquals("Alva", customers.get(2040).getFirstName());
	}

	@Test
	@DisplayName("Record 2041: LastName is Danson")
	void LastNameOfRecord2041() {
		assertEquals("Danson", customers.get(2040).getLastName());
	}

	@Test
	@DisplayName("Record 2041: Company is Copy Shop")
	void CompanyOfRecord2041() {
		assertEquals("Copy Shop", customers.get(2040).getCompany());
	}

	@Test
	@DisplayName("Record 2041: Address is 380 W Palatine Rd")
	void AddressOfRecord2041() {
		assertEquals("380 W Palatine Rd", customers.get(2040).getAddress());
	}

	@Test
	@DisplayName("Record 2041: City is Wheeling")
	void CityOfRecord2041() {
		assertEquals("Wheeling", customers.get(2040).getCity());
	}

	@Test
	@DisplayName("Record 2041: County is Cook")
	void CountyOfRecord2041() {
		assertEquals("Cook", customers.get(2040).getCounty());
	}

	@Test
	@DisplayName("Record 2041: State is IL")
	void StateOfRecord2041() {
		assertEquals("IL", customers.get(2040).getState());
	}

	@Test
	@DisplayName("Record 2041: ZIP is 60090")
	void ZIPOfRecord2041() {
		assertEquals("60090", customers.get(2040).getZIP());
	}

	@Test
	@DisplayName("Record 2041: Phone is 847-520-5380")
	void PhoneOfRecord2041() {
		assertEquals("847-520-5380", customers.get(2040).getPhone());
	}

	@Test
	@DisplayName("Record 2041: Fax is 847-520-1433")
	void FaxOfRecord2041() {
		assertEquals("847-520-1433", customers.get(2040).getFax());
	}

	@Test
	@DisplayName("Record 2041: Email is alva@danson.com")
	void EmailOfRecord2041() {
		assertEquals("alva@danson.com", customers.get(2040).getEmail());
	}

	@Test
	@DisplayName("Record 2041: Web is http://www.alvadanson.com")
	void WebOfRecord2041() {
		assertEquals("http://www.alvadanson.com", customers.get(2040).getWeb());
	}
}
