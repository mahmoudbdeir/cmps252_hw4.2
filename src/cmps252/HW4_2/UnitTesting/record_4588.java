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

@Tag("44")
class Record_4588 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4588: FirstName is Georgette")
	void FirstNameOfRecord4588() {
		assertEquals("Georgette", customers.get(4587).getFirstName());
	}

	@Test
	@DisplayName("Record 4588: LastName is Christopherse")
	void LastNameOfRecord4588() {
		assertEquals("Christopherse", customers.get(4587).getLastName());
	}

	@Test
	@DisplayName("Record 4588: Company is Von Krysler, Nicolai Esq")
	void CompanyOfRecord4588() {
		assertEquals("Von Krysler, Nicolai Esq", customers.get(4587).getCompany());
	}

	@Test
	@DisplayName("Record 4588: Address is 3144 Willits Rd")
	void AddressOfRecord4588() {
		assertEquals("3144 Willits Rd", customers.get(4587).getAddress());
	}

	@Test
	@DisplayName("Record 4588: City is Philadelphia")
	void CityOfRecord4588() {
		assertEquals("Philadelphia", customers.get(4587).getCity());
	}

	@Test
	@DisplayName("Record 4588: County is Philadelphia")
	void CountyOfRecord4588() {
		assertEquals("Philadelphia", customers.get(4587).getCounty());
	}

	@Test
	@DisplayName("Record 4588: State is PA")
	void StateOfRecord4588() {
		assertEquals("PA", customers.get(4587).getState());
	}

	@Test
	@DisplayName("Record 4588: ZIP is 19136")
	void ZIPOfRecord4588() {
		assertEquals("19136", customers.get(4587).getZIP());
	}

	@Test
	@DisplayName("Record 4588: Phone is 215-969-9325")
	void PhoneOfRecord4588() {
		assertEquals("215-969-9325", customers.get(4587).getPhone());
	}

	@Test
	@DisplayName("Record 4588: Fax is 215-969-0256")
	void FaxOfRecord4588() {
		assertEquals("215-969-0256", customers.get(4587).getFax());
	}

	@Test
	@DisplayName("Record 4588: Email is georgette@christopherse.com")
	void EmailOfRecord4588() {
		assertEquals("georgette@christopherse.com", customers.get(4587).getEmail());
	}

	@Test
	@DisplayName("Record 4588: Web is http://www.georgettechristopherse.com")
	void WebOfRecord4588() {
		assertEquals("http://www.georgettechristopherse.com", customers.get(4587).getWeb());
	}
}
