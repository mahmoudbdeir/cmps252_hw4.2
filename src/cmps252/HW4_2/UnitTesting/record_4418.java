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

@Tag("10")
class Record_4418 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4418: FirstName is Veda")
	void FirstNameOfRecord4418() {
		assertEquals("Veda", customers.get(4417).getFirstName());
	}

	@Test
	@DisplayName("Record 4418: LastName is Zavadoski")
	void LastNameOfRecord4418() {
		assertEquals("Zavadoski", customers.get(4417).getLastName());
	}

	@Test
	@DisplayName("Record 4418: Company is Post, Robert S Esq")
	void CompanyOfRecord4418() {
		assertEquals("Post, Robert S Esq", customers.get(4417).getCompany());
	}

	@Test
	@DisplayName("Record 4418: Address is 1050 Connecticut Ave Nw")
	void AddressOfRecord4418() {
		assertEquals("1050 Connecticut Ave Nw", customers.get(4417).getAddress());
	}

	@Test
	@DisplayName("Record 4418: City is Washington")
	void CityOfRecord4418() {
		assertEquals("Washington", customers.get(4417).getCity());
	}

	@Test
	@DisplayName("Record 4418: County is District of Columbia")
	void CountyOfRecord4418() {
		assertEquals("District of Columbia", customers.get(4417).getCounty());
	}

	@Test
	@DisplayName("Record 4418: State is DC")
	void StateOfRecord4418() {
		assertEquals("DC", customers.get(4417).getState());
	}

	@Test
	@DisplayName("Record 4418: ZIP is 20036")
	void ZIPOfRecord4418() {
		assertEquals("20036", customers.get(4417).getZIP());
	}

	@Test
	@DisplayName("Record 4418: Phone is 202-857-7736")
	void PhoneOfRecord4418() {
		assertEquals("202-857-7736", customers.get(4417).getPhone());
	}

	@Test
	@DisplayName("Record 4418: Fax is 202-857-8621")
	void FaxOfRecord4418() {
		assertEquals("202-857-8621", customers.get(4417).getFax());
	}

	@Test
	@DisplayName("Record 4418: Email is veda@zavadoski.com")
	void EmailOfRecord4418() {
		assertEquals("veda@zavadoski.com", customers.get(4417).getEmail());
	}

	@Test
	@DisplayName("Record 4418: Web is http://www.vedazavadoski.com")
	void WebOfRecord4418() {
		assertEquals("http://www.vedazavadoski.com", customers.get(4417).getWeb());
	}
}
