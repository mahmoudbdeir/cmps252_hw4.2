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

@Tag("21")
class Record_4787 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4787: FirstName is Huey")
	void FirstNameOfRecord4787() {
		assertEquals("Huey", customers.get(4786).getFirstName());
	}

	@Test
	@DisplayName("Record 4787: LastName is Shellhorn")
	void LastNameOfRecord4787() {
		assertEquals("Shellhorn", customers.get(4786).getLastName());
	}

	@Test
	@DisplayName("Record 4787: Company is Morley, Sam R Esq")
	void CompanyOfRecord4787() {
		assertEquals("Morley, Sam R Esq", customers.get(4786).getCompany());
	}

	@Test
	@DisplayName("Record 4787: Address is 628 S Flower St")
	void AddressOfRecord4787() {
		assertEquals("628 S Flower St", customers.get(4786).getAddress());
	}

	@Test
	@DisplayName("Record 4787: City is Burbank")
	void CityOfRecord4787() {
		assertEquals("Burbank", customers.get(4786).getCity());
	}

	@Test
	@DisplayName("Record 4787: County is Los Angeles")
	void CountyOfRecord4787() {
		assertEquals("Los Angeles", customers.get(4786).getCounty());
	}

	@Test
	@DisplayName("Record 4787: State is CA")
	void StateOfRecord4787() {
		assertEquals("CA", customers.get(4786).getState());
	}

	@Test
	@DisplayName("Record 4787: ZIP is 91502")
	void ZIPOfRecord4787() {
		assertEquals("91502", customers.get(4786).getZIP());
	}

	@Test
	@DisplayName("Record 4787: Phone is 818-843-0890")
	void PhoneOfRecord4787() {
		assertEquals("818-843-0890", customers.get(4786).getPhone());
	}

	@Test
	@DisplayName("Record 4787: Fax is 818-843-7294")
	void FaxOfRecord4787() {
		assertEquals("818-843-7294", customers.get(4786).getFax());
	}

	@Test
	@DisplayName("Record 4787: Email is huey@shellhorn.com")
	void EmailOfRecord4787() {
		assertEquals("huey@shellhorn.com", customers.get(4786).getEmail());
	}

	@Test
	@DisplayName("Record 4787: Web is http://www.hueyshellhorn.com")
	void WebOfRecord4787() {
		assertEquals("http://www.hueyshellhorn.com", customers.get(4786).getWeb());
	}
}
