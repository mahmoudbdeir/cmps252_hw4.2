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

@Tag("47")
class Record_588 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 588: FirstName is Ivette")
	void FirstNameOfRecord588() {
		assertEquals("Ivette", customers.get(587).getFirstName());
	}

	@Test
	@DisplayName("Record 588: LastName is Stratis")
	void LastNameOfRecord588() {
		assertEquals("Stratis", customers.get(587).getLastName());
	}

	@Test
	@DisplayName("Record 588: Company is Drago, Alexander J Esq")
	void CompanyOfRecord588() {
		assertEquals("Drago, Alexander J Esq", customers.get(587).getCompany());
	}

	@Test
	@DisplayName("Record 588: Address is 161 Hudson St")
	void AddressOfRecord588() {
		assertEquals("161 Hudson St", customers.get(587).getAddress());
	}

	@Test
	@DisplayName("Record 588: City is New York")
	void CityOfRecord588() {
		assertEquals("New York", customers.get(587).getCity());
	}

	@Test
	@DisplayName("Record 588: County is New York")
	void CountyOfRecord588() {
		assertEquals("New York", customers.get(587).getCounty());
	}

	@Test
	@DisplayName("Record 588: State is NY")
	void StateOfRecord588() {
		assertEquals("NY", customers.get(587).getState());
	}

	@Test
	@DisplayName("Record 588: ZIP is 10013")
	void ZIPOfRecord588() {
		assertEquals("10013", customers.get(587).getZIP());
	}

	@Test
	@DisplayName("Record 588: Phone is 212-334-1232")
	void PhoneOfRecord588() {
		assertEquals("212-334-1232", customers.get(587).getPhone());
	}

	@Test
	@DisplayName("Record 588: Fax is 212-334-6379")
	void FaxOfRecord588() {
		assertEquals("212-334-6379", customers.get(587).getFax());
	}

	@Test
	@DisplayName("Record 588: Email is ivette@stratis.com")
	void EmailOfRecord588() {
		assertEquals("ivette@stratis.com", customers.get(587).getEmail());
	}

	@Test
	@DisplayName("Record 588: Web is http://www.ivettestratis.com")
	void WebOfRecord588() {
		assertEquals("http://www.ivettestratis.com", customers.get(587).getWeb());
	}
}
