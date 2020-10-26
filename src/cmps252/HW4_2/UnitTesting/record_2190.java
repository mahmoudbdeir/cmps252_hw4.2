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

@Tag("30")
class Record_2190 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2190: FirstName is Manuela")
	void FirstNameOfRecord2190() {
		assertEquals("Manuela", customers.get(2189).getFirstName());
	}

	@Test
	@DisplayName("Record 2190: LastName is Koscinski")
	void LastNameOfRecord2190() {
		assertEquals("Koscinski", customers.get(2189).getLastName());
	}

	@Test
	@DisplayName("Record 2190: Company is Johnston The Florist")
	void CompanyOfRecord2190() {
		assertEquals("Johnston The Florist", customers.get(2189).getCompany());
	}

	@Test
	@DisplayName("Record 2190: Address is 104 Scioto St")
	void AddressOfRecord2190() {
		assertEquals("104 Scioto St", customers.get(2189).getAddress());
	}

	@Test
	@DisplayName("Record 2190: City is Urbana")
	void CityOfRecord2190() {
		assertEquals("Urbana", customers.get(2189).getCity());
	}

	@Test
	@DisplayName("Record 2190: County is Champaign")
	void CountyOfRecord2190() {
		assertEquals("Champaign", customers.get(2189).getCounty());
	}

	@Test
	@DisplayName("Record 2190: State is OH")
	void StateOfRecord2190() {
		assertEquals("OH", customers.get(2189).getState());
	}

	@Test
	@DisplayName("Record 2190: ZIP is 43078")
	void ZIPOfRecord2190() {
		assertEquals("43078", customers.get(2189).getZIP());
	}

	@Test
	@DisplayName("Record 2190: Phone is 937-652-7218")
	void PhoneOfRecord2190() {
		assertEquals("937-652-7218", customers.get(2189).getPhone());
	}

	@Test
	@DisplayName("Record 2190: Fax is 937-652-9161")
	void FaxOfRecord2190() {
		assertEquals("937-652-9161", customers.get(2189).getFax());
	}

	@Test
	@DisplayName("Record 2190: Email is manuela@koscinski.com")
	void EmailOfRecord2190() {
		assertEquals("manuela@koscinski.com", customers.get(2189).getEmail());
	}

	@Test
	@DisplayName("Record 2190: Web is http://www.manuelakoscinski.com")
	void WebOfRecord2190() {
		assertEquals("http://www.manuelakoscinski.com", customers.get(2189).getWeb());
	}
}
