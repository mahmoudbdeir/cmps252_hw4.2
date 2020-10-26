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

@Tag("12")
class Record_1725 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1725: FirstName is Herman")
	void FirstNameOfRecord1725() {
		assertEquals("Herman", customers.get(1724).getFirstName());
	}

	@Test
	@DisplayName("Record 1725: LastName is Godeaux")
	void LastNameOfRecord1725() {
		assertEquals("Godeaux", customers.get(1724).getLastName());
	}

	@Test
	@DisplayName("Record 1725: Company is Simons, Alan J Md")
	void CompanyOfRecord1725() {
		assertEquals("Simons, Alan J Md", customers.get(1724).getCompany());
	}

	@Test
	@DisplayName("Record 1725: Address is 2nd Mtt Vernon")
	void AddressOfRecord1725() {
		assertEquals("2nd Mtt Vernon", customers.get(1724).getAddress());
	}

	@Test
	@DisplayName("Record 1725: City is Ridgefield Park")
	void CityOfRecord1725() {
		assertEquals("Ridgefield Park", customers.get(1724).getCity());
	}

	@Test
	@DisplayName("Record 1725: County is Bergen")
	void CountyOfRecord1725() {
		assertEquals("Bergen", customers.get(1724).getCounty());
	}

	@Test
	@DisplayName("Record 1725: State is NJ")
	void StateOfRecord1725() {
		assertEquals("NJ", customers.get(1724).getState());
	}

	@Test
	@DisplayName("Record 1725: ZIP is 7660")
	void ZIPOfRecord1725() {
		assertEquals("7660", customers.get(1724).getZIP());
	}

	@Test
	@DisplayName("Record 1725: Phone is 201-641-2176")
	void PhoneOfRecord1725() {
		assertEquals("201-641-2176", customers.get(1724).getPhone());
	}

	@Test
	@DisplayName("Record 1725: Fax is 201-641-1618")
	void FaxOfRecord1725() {
		assertEquals("201-641-1618", customers.get(1724).getFax());
	}

	@Test
	@DisplayName("Record 1725: Email is herman@godeaux.com")
	void EmailOfRecord1725() {
		assertEquals("herman@godeaux.com", customers.get(1724).getEmail());
	}

	@Test
	@DisplayName("Record 1725: Web is http://www.hermangodeaux.com")
	void WebOfRecord1725() {
		assertEquals("http://www.hermangodeaux.com", customers.get(1724).getWeb());
	}
}
