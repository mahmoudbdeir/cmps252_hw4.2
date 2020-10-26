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
class Record_2932 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2932: FirstName is Ernestine")
	void FirstNameOfRecord2932() {
		assertEquals("Ernestine", customers.get(2931).getFirstName());
	}

	@Test
	@DisplayName("Record 2932: LastName is Landgraf")
	void LastNameOfRecord2932() {
		assertEquals("Landgraf", customers.get(2931).getLastName());
	}

	@Test
	@DisplayName("Record 2932: Company is Gold & Silver Financial Group")
	void CompanyOfRecord2932() {
		assertEquals("Gold & Silver Financial Group", customers.get(2931).getCompany());
	}

	@Test
	@DisplayName("Record 2932: Address is 1102 Crescent St")
	void AddressOfRecord2932() {
		assertEquals("1102 Crescent St", customers.get(2931).getAddress());
	}

	@Test
	@DisplayName("Record 2932: City is Wenatchee")
	void CityOfRecord2932() {
		assertEquals("Wenatchee", customers.get(2931).getCity());
	}

	@Test
	@DisplayName("Record 2932: County is Chelan")
	void CountyOfRecord2932() {
		assertEquals("Chelan", customers.get(2931).getCounty());
	}

	@Test
	@DisplayName("Record 2932: State is WA")
	void StateOfRecord2932() {
		assertEquals("WA", customers.get(2931).getState());
	}

	@Test
	@DisplayName("Record 2932: ZIP is 98801")
	void ZIPOfRecord2932() {
		assertEquals("98801", customers.get(2931).getZIP());
	}

	@Test
	@DisplayName("Record 2932: Phone is 509-662-3722")
	void PhoneOfRecord2932() {
		assertEquals("509-662-3722", customers.get(2931).getPhone());
	}

	@Test
	@DisplayName("Record 2932: Fax is 509-662-4384")
	void FaxOfRecord2932() {
		assertEquals("509-662-4384", customers.get(2931).getFax());
	}

	@Test
	@DisplayName("Record 2932: Email is ernestine@landgraf.com")
	void EmailOfRecord2932() {
		assertEquals("ernestine@landgraf.com", customers.get(2931).getEmail());
	}

	@Test
	@DisplayName("Record 2932: Web is http://www.ernestinelandgraf.com")
	void WebOfRecord2932() {
		assertEquals("http://www.ernestinelandgraf.com", customers.get(2931).getWeb());
	}
}
