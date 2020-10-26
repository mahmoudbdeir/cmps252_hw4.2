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
class Record_4845 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4845: FirstName is Ariel")
	void FirstNameOfRecord4845() {
		assertEquals("Ariel", customers.get(4844).getFirstName());
	}

	@Test
	@DisplayName("Record 4845: LastName is Spahn")
	void LastNameOfRecord4845() {
		assertEquals("Spahn", customers.get(4844).getLastName());
	}

	@Test
	@DisplayName("Record 4845: Company is S J Industries Inc")
	void CompanyOfRecord4845() {
		assertEquals("S J Industries Inc", customers.get(4844).getCompany());
	}

	@Test
	@DisplayName("Record 4845: Address is 175 Fair St")
	void AddressOfRecord4845() {
		assertEquals("175 Fair St", customers.get(4844).getAddress());
	}

	@Test
	@DisplayName("Record 4845: City is Palisades Park")
	void CityOfRecord4845() {
		assertEquals("Palisades Park", customers.get(4844).getCity());
	}

	@Test
	@DisplayName("Record 4845: County is Bergen")
	void CountyOfRecord4845() {
		assertEquals("Bergen", customers.get(4844).getCounty());
	}

	@Test
	@DisplayName("Record 4845: State is NJ")
	void StateOfRecord4845() {
		assertEquals("NJ", customers.get(4844).getState());
	}

	@Test
	@DisplayName("Record 4845: ZIP is 7650")
	void ZIPOfRecord4845() {
		assertEquals("7650", customers.get(4844).getZIP());
	}

	@Test
	@DisplayName("Record 4845: Phone is 201-947-4142")
	void PhoneOfRecord4845() {
		assertEquals("201-947-4142", customers.get(4844).getPhone());
	}

	@Test
	@DisplayName("Record 4845: Fax is 201-947-3451")
	void FaxOfRecord4845() {
		assertEquals("201-947-3451", customers.get(4844).getFax());
	}

	@Test
	@DisplayName("Record 4845: Email is ariel@spahn.com")
	void EmailOfRecord4845() {
		assertEquals("ariel@spahn.com", customers.get(4844).getEmail());
	}

	@Test
	@DisplayName("Record 4845: Web is http://www.arielspahn.com")
	void WebOfRecord4845() {
		assertEquals("http://www.arielspahn.com", customers.get(4844).getWeb());
	}
}
