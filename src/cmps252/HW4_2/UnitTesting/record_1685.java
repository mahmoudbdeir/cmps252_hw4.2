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

@Tag("40")
class Record_1685 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1685: FirstName is Joey")
	void FirstNameOfRecord1685() {
		assertEquals("Joey", customers.get(1684).getFirstName());
	}

	@Test
	@DisplayName("Record 1685: LastName is Debrot")
	void LastNameOfRecord1685() {
		assertEquals("Debrot", customers.get(1684).getLastName());
	}

	@Test
	@DisplayName("Record 1685: Company is Wellesley Inn")
	void CompanyOfRecord1685() {
		assertEquals("Wellesley Inn", customers.get(1684).getCompany());
	}

	@Test
	@DisplayName("Record 1685: Address is 424 16th St N")
	void AddressOfRecord1685() {
		assertEquals("424 16th St N", customers.get(1684).getAddress());
	}

	@Test
	@DisplayName("Record 1685: City is Birmingham")
	void CityOfRecord1685() {
		assertEquals("Birmingham", customers.get(1684).getCity());
	}

	@Test
	@DisplayName("Record 1685: County is Jefferson")
	void CountyOfRecord1685() {
		assertEquals("Jefferson", customers.get(1684).getCounty());
	}

	@Test
	@DisplayName("Record 1685: State is AL")
	void StateOfRecord1685() {
		assertEquals("AL", customers.get(1684).getState());
	}

	@Test
	@DisplayName("Record 1685: ZIP is 35203")
	void ZIPOfRecord1685() {
		assertEquals("35203", customers.get(1684).getZIP());
	}

	@Test
	@DisplayName("Record 1685: Phone is 205-254-3174")
	void PhoneOfRecord1685() {
		assertEquals("205-254-3174", customers.get(1684).getPhone());
	}

	@Test
	@DisplayName("Record 1685: Fax is 205-254-2313")
	void FaxOfRecord1685() {
		assertEquals("205-254-2313", customers.get(1684).getFax());
	}

	@Test
	@DisplayName("Record 1685: Email is joey@debrot.com")
	void EmailOfRecord1685() {
		assertEquals("joey@debrot.com", customers.get(1684).getEmail());
	}

	@Test
	@DisplayName("Record 1685: Web is http://www.joeydebrot.com")
	void WebOfRecord1685() {
		assertEquals("http://www.joeydebrot.com", customers.get(1684).getWeb());
	}
}
