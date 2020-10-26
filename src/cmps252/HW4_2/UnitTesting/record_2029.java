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
class Record_2029 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2029: FirstName is Heather")
	void FirstNameOfRecord2029() {
		assertEquals("Heather", customers.get(2028).getFirstName());
	}

	@Test
	@DisplayName("Record 2029: LastName is Huggins")
	void LastNameOfRecord2029() {
		assertEquals("Huggins", customers.get(2028).getLastName());
	}

	@Test
	@DisplayName("Record 2029: Company is China Town Chinese Restaurant")
	void CompanyOfRecord2029() {
		assertEquals("China Town Chinese Restaurant", customers.get(2028).getCompany());
	}

	@Test
	@DisplayName("Record 2029: Address is 1625 Tillie Lewis Dr")
	void AddressOfRecord2029() {
		assertEquals("1625 Tillie Lewis Dr", customers.get(2028).getAddress());
	}

	@Test
	@DisplayName("Record 2029: City is Stockton")
	void CityOfRecord2029() {
		assertEquals("Stockton", customers.get(2028).getCity());
	}

	@Test
	@DisplayName("Record 2029: County is San Joaquin")
	void CountyOfRecord2029() {
		assertEquals("San Joaquin", customers.get(2028).getCounty());
	}

	@Test
	@DisplayName("Record 2029: State is CA")
	void StateOfRecord2029() {
		assertEquals("CA", customers.get(2028).getState());
	}

	@Test
	@DisplayName("Record 2029: ZIP is 95206")
	void ZIPOfRecord2029() {
		assertEquals("95206", customers.get(2028).getZIP());
	}

	@Test
	@DisplayName("Record 2029: Phone is 209-944-1242")
	void PhoneOfRecord2029() {
		assertEquals("209-944-1242", customers.get(2028).getPhone());
	}

	@Test
	@DisplayName("Record 2029: Fax is 209-944-8751")
	void FaxOfRecord2029() {
		assertEquals("209-944-8751", customers.get(2028).getFax());
	}

	@Test
	@DisplayName("Record 2029: Email is heather@huggins.com")
	void EmailOfRecord2029() {
		assertEquals("heather@huggins.com", customers.get(2028).getEmail());
	}

	@Test
	@DisplayName("Record 2029: Web is http://www.heatherhuggins.com")
	void WebOfRecord2029() {
		assertEquals("http://www.heatherhuggins.com", customers.get(2028).getWeb());
	}
}
