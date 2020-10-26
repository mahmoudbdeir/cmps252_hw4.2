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
class Record_2726 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2726: FirstName is Benita")
	void FirstNameOfRecord2726() {
		assertEquals("Benita", customers.get(2725).getFirstName());
	}

	@Test
	@DisplayName("Record 2726: LastName is Hagood")
	void LastNameOfRecord2726() {
		assertEquals("Hagood", customers.get(2725).getLastName());
	}

	@Test
	@DisplayName("Record 2726: Company is Bills Seafood House")
	void CompanyOfRecord2726() {
		assertEquals("Bills Seafood House", customers.get(2725).getCompany());
	}

	@Test
	@DisplayName("Record 2726: Address is Savannah St")
	void AddressOfRecord2726() {
		assertEquals("Savannah St", customers.get(2725).getAddress());
	}

	@Test
	@DisplayName("Record 2726: City is Clayton")
	void CityOfRecord2726() {
		assertEquals("Clayton", customers.get(2725).getCity());
	}

	@Test
	@DisplayName("Record 2726: County is Rabun")
	void CountyOfRecord2726() {
		assertEquals("Rabun", customers.get(2725).getCounty());
	}

	@Test
	@DisplayName("Record 2726: State is GA")
	void StateOfRecord2726() {
		assertEquals("GA", customers.get(2725).getState());
	}

	@Test
	@DisplayName("Record 2726: ZIP is 30525")
	void ZIPOfRecord2726() {
		assertEquals("30525", customers.get(2725).getZIP());
	}

	@Test
	@DisplayName("Record 2726: Phone is 706-782-2639")
	void PhoneOfRecord2726() {
		assertEquals("706-782-2639", customers.get(2725).getPhone());
	}

	@Test
	@DisplayName("Record 2726: Fax is 706-782-7565")
	void FaxOfRecord2726() {
		assertEquals("706-782-7565", customers.get(2725).getFax());
	}

	@Test
	@DisplayName("Record 2726: Email is benita@hagood.com")
	void EmailOfRecord2726() {
		assertEquals("benita@hagood.com", customers.get(2725).getEmail());
	}

	@Test
	@DisplayName("Record 2726: Web is http://www.benitahagood.com")
	void WebOfRecord2726() {
		assertEquals("http://www.benitahagood.com", customers.get(2725).getWeb());
	}
}
