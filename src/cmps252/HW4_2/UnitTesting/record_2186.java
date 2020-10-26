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

@Tag("28")
class Record_2186 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2186: FirstName is Otto")
	void FirstNameOfRecord2186() {
		assertEquals("Otto", customers.get(2185).getFirstName());
	}

	@Test
	@DisplayName("Record 2186: LastName is Boulay")
	void LastNameOfRecord2186() {
		assertEquals("Boulay", customers.get(2185).getLastName());
	}

	@Test
	@DisplayName("Record 2186: Company is Sinkr Swim Shop")
	void CompanyOfRecord2186() {
		assertEquals("Sinkr Swim Shop", customers.get(2185).getCompany());
	}

	@Test
	@DisplayName("Record 2186: Address is 6031 Pillsbury Ave")
	void AddressOfRecord2186() {
		assertEquals("6031 Pillsbury Ave", customers.get(2185).getAddress());
	}

	@Test
	@DisplayName("Record 2186: City is Minneapolis")
	void CityOfRecord2186() {
		assertEquals("Minneapolis", customers.get(2185).getCity());
	}

	@Test
	@DisplayName("Record 2186: County is Hennepin")
	void CountyOfRecord2186() {
		assertEquals("Hennepin", customers.get(2185).getCounty());
	}

	@Test
	@DisplayName("Record 2186: State is MN")
	void StateOfRecord2186() {
		assertEquals("MN", customers.get(2185).getState());
	}

	@Test
	@DisplayName("Record 2186: ZIP is 55419")
	void ZIPOfRecord2186() {
		assertEquals("55419", customers.get(2185).getZIP());
	}

	@Test
	@DisplayName("Record 2186: Phone is 612-866-1153")
	void PhoneOfRecord2186() {
		assertEquals("612-866-1153", customers.get(2185).getPhone());
	}

	@Test
	@DisplayName("Record 2186: Fax is 612-866-7187")
	void FaxOfRecord2186() {
		assertEquals("612-866-7187", customers.get(2185).getFax());
	}

	@Test
	@DisplayName("Record 2186: Email is otto@boulay.com")
	void EmailOfRecord2186() {
		assertEquals("otto@boulay.com", customers.get(2185).getEmail());
	}

	@Test
	@DisplayName("Record 2186: Web is http://www.ottoboulay.com")
	void WebOfRecord2186() {
		assertEquals("http://www.ottoboulay.com", customers.get(2185).getWeb());
	}
}
