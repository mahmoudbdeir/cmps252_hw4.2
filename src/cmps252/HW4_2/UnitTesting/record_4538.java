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

@Tag("15")
class Record_4538 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4538: FirstName is Eldridge")
	void FirstNameOfRecord4538() {
		assertEquals("Eldridge", customers.get(4537).getFirstName());
	}

	@Test
	@DisplayName("Record 4538: LastName is Castellaneta")
	void LastNameOfRecord4538() {
		assertEquals("Castellaneta", customers.get(4537).getLastName());
	}

	@Test
	@DisplayName("Record 4538: Company is Toko America Inc")
	void CompanyOfRecord4538() {
		assertEquals("Toko America Inc", customers.get(4537).getCompany());
	}

	@Test
	@DisplayName("Record 4538: Address is 1276 Main Ave")
	void AddressOfRecord4538() {
		assertEquals("1276 Main Ave", customers.get(4537).getAddress());
	}

	@Test
	@DisplayName("Record 4538: City is Clifton")
	void CityOfRecord4538() {
		assertEquals("Clifton", customers.get(4537).getCity());
	}

	@Test
	@DisplayName("Record 4538: County is Passaic")
	void CountyOfRecord4538() {
		assertEquals("Passaic", customers.get(4537).getCounty());
	}

	@Test
	@DisplayName("Record 4538: State is NJ")
	void StateOfRecord4538() {
		assertEquals("NJ", customers.get(4537).getState());
	}

	@Test
	@DisplayName("Record 4538: ZIP is 7011")
	void ZIPOfRecord4538() {
		assertEquals("7011", customers.get(4537).getZIP());
	}

	@Test
	@DisplayName("Record 4538: Phone is 973-340-7244")
	void PhoneOfRecord4538() {
		assertEquals("973-340-7244", customers.get(4537).getPhone());
	}

	@Test
	@DisplayName("Record 4538: Fax is 973-340-6082")
	void FaxOfRecord4538() {
		assertEquals("973-340-6082", customers.get(4537).getFax());
	}

	@Test
	@DisplayName("Record 4538: Email is eldridge@castellaneta.com")
	void EmailOfRecord4538() {
		assertEquals("eldridge@castellaneta.com", customers.get(4537).getEmail());
	}

	@Test
	@DisplayName("Record 4538: Web is http://www.eldridgecastellaneta.com")
	void WebOfRecord4538() {
		assertEquals("http://www.eldridgecastellaneta.com", customers.get(4537).getWeb());
	}
}
