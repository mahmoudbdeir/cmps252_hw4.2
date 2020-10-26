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

@Tag("8")
class Record_4751 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4751: FirstName is Aron")
	void FirstNameOfRecord4751() {
		assertEquals("Aron", customers.get(4750).getFirstName());
	}

	@Test
	@DisplayName("Record 4751: LastName is Knuckles")
	void LastNameOfRecord4751() {
		assertEquals("Knuckles", customers.get(4750).getLastName());
	}

	@Test
	@DisplayName("Record 4751: Company is A A Aabad Cuellars Locksmth")
	void CompanyOfRecord4751() {
		assertEquals("A A Aabad Cuellars Locksmth", customers.get(4750).getCompany());
	}

	@Test
	@DisplayName("Record 4751: Address is 274 Madison Ave  #-1501")
	void AddressOfRecord4751() {
		assertEquals("274 Madison Ave  #-1501", customers.get(4750).getAddress());
	}

	@Test
	@DisplayName("Record 4751: City is New York")
	void CityOfRecord4751() {
		assertEquals("New York", customers.get(4750).getCity());
	}

	@Test
	@DisplayName("Record 4751: County is New York")
	void CountyOfRecord4751() {
		assertEquals("New York", customers.get(4750).getCounty());
	}

	@Test
	@DisplayName("Record 4751: State is NY")
	void StateOfRecord4751() {
		assertEquals("NY", customers.get(4750).getState());
	}

	@Test
	@DisplayName("Record 4751: ZIP is 10016")
	void ZIPOfRecord4751() {
		assertEquals("10016", customers.get(4750).getZIP());
	}

	@Test
	@DisplayName("Record 4751: Phone is 212-779-6770")
	void PhoneOfRecord4751() {
		assertEquals("212-779-6770", customers.get(4750).getPhone());
	}

	@Test
	@DisplayName("Record 4751: Fax is 212-779-9129")
	void FaxOfRecord4751() {
		assertEquals("212-779-9129", customers.get(4750).getFax());
	}

	@Test
	@DisplayName("Record 4751: Email is aron@knuckles.com")
	void EmailOfRecord4751() {
		assertEquals("aron@knuckles.com", customers.get(4750).getEmail());
	}

	@Test
	@DisplayName("Record 4751: Web is http://www.aronknuckles.com")
	void WebOfRecord4751() {
		assertEquals("http://www.aronknuckles.com", customers.get(4750).getWeb());
	}
}
