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

@Tag("36")
class Record_1542 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1542: FirstName is Sally")
	void FirstNameOfRecord1542() {
		assertEquals("Sally", customers.get(1541).getFirstName());
	}

	@Test
	@DisplayName("Record 1542: LastName is Amonette")
	void LastNameOfRecord1542() {
		assertEquals("Amonette", customers.get(1541).getLastName());
	}

	@Test
	@DisplayName("Record 1542: Company is Silverstone, David A Esq")
	void CompanyOfRecord1542() {
		assertEquals("Silverstone, David A Esq", customers.get(1541).getCompany());
	}

	@Test
	@DisplayName("Record 1542: Address is 2974 Graves Ln")
	void AddressOfRecord1542() {
		assertEquals("2974 Graves Ln", customers.get(1541).getAddress());
	}

	@Test
	@DisplayName("Record 1542: City is Cincinnati")
	void CityOfRecord1542() {
		assertEquals("Cincinnati", customers.get(1541).getCity());
	}

	@Test
	@DisplayName("Record 1542: County is Hamilton")
	void CountyOfRecord1542() {
		assertEquals("Hamilton", customers.get(1541).getCounty());
	}

	@Test
	@DisplayName("Record 1542: State is OH")
	void StateOfRecord1542() {
		assertEquals("OH", customers.get(1541).getState());
	}

	@Test
	@DisplayName("Record 1542: ZIP is 45241")
	void ZIPOfRecord1542() {
		assertEquals("45241", customers.get(1541).getZIP());
	}

	@Test
	@DisplayName("Record 1542: Phone is 513-769-2283")
	void PhoneOfRecord1542() {
		assertEquals("513-769-2283", customers.get(1541).getPhone());
	}

	@Test
	@DisplayName("Record 1542: Fax is 513-769-2021")
	void FaxOfRecord1542() {
		assertEquals("513-769-2021", customers.get(1541).getFax());
	}

	@Test
	@DisplayName("Record 1542: Email is sally@amonette.com")
	void EmailOfRecord1542() {
		assertEquals("sally@amonette.com", customers.get(1541).getEmail());
	}

	@Test
	@DisplayName("Record 1542: Web is http://www.sallyamonette.com")
	void WebOfRecord1542() {
		assertEquals("http://www.sallyamonette.com", customers.get(1541).getWeb());
	}
}
