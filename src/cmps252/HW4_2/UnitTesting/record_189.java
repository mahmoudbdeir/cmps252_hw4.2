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

@Tag("1")
class Record_189 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 189: FirstName is Kristie")
	void FirstNameOfRecord189() {
		assertEquals("Kristie", customers.get(188).getFirstName());
	}

	@Test
	@DisplayName("Record 189: LastName is Segner")
	void LastNameOfRecord189() {
		assertEquals("Segner", customers.get(188).getLastName());
	}

	@Test
	@DisplayName("Record 189: Company is Cardin, Richard W Cpa")
	void CompanyOfRecord189() {
		assertEquals("Cardin, Richard W Cpa", customers.get(188).getCompany());
	}

	@Test
	@DisplayName("Record 189: Address is Box #-44141")
	void AddressOfRecord189() {
		assertEquals("Box #-44141", customers.get(188).getAddress());
	}

	@Test
	@DisplayName("Record 189: City is Houston")
	void CityOfRecord189() {
		assertEquals("Houston", customers.get(188).getCity());
	}

	@Test
	@DisplayName("Record 189: County is Harris")
	void CountyOfRecord189() {
		assertEquals("Harris", customers.get(188).getCounty());
	}

	@Test
	@DisplayName("Record 189: State is TX")
	void StateOfRecord189() {
		assertEquals("TX", customers.get(188).getState());
	}

	@Test
	@DisplayName("Record 189: ZIP is 77244")
	void ZIPOfRecord189() {
		assertEquals("77244", customers.get(188).getZIP());
	}

	@Test
	@DisplayName("Record 189: Phone is 713-493-6741")
	void PhoneOfRecord189() {
		assertEquals("713-493-6741", customers.get(188).getPhone());
	}

	@Test
	@DisplayName("Record 189: Fax is 713-493-6167")
	void FaxOfRecord189() {
		assertEquals("713-493-6167", customers.get(188).getFax());
	}

	@Test
	@DisplayName("Record 189: Email is kristie@segner.com")
	void EmailOfRecord189() {
		assertEquals("kristie@segner.com", customers.get(188).getEmail());
	}

	@Test
	@DisplayName("Record 189: Web is http://www.kristiesegner.com")
	void WebOfRecord189() {
		assertEquals("http://www.kristiesegner.com", customers.get(188).getWeb());
	}
}
