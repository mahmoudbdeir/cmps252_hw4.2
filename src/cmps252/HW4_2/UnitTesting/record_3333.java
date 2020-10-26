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

@Tag("20")
class Record_3333 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3333: FirstName is Claude")
	void FirstNameOfRecord3333() {
		assertEquals("Claude", customers.get(3332).getFirstName());
	}

	@Test
	@DisplayName("Record 3333: LastName is Piscitello")
	void LastNameOfRecord3333() {
		assertEquals("Piscitello", customers.get(3332).getLastName());
	}

	@Test
	@DisplayName("Record 3333: Company is Nippard, Lewis Straughn Pa")
	void CompanyOfRecord3333() {
		assertEquals("Nippard, Lewis Straughn Pa", customers.get(3332).getCompany());
	}

	@Test
	@DisplayName("Record 3333: Address is 127 Maple St")
	void AddressOfRecord3333() {
		assertEquals("127 Maple St", customers.get(3332).getAddress());
	}

	@Test
	@DisplayName("Record 3333: City is Madison")
	void CityOfRecord3333() {
		assertEquals("Madison", customers.get(3332).getCity());
	}

	@Test
	@DisplayName("Record 3333: County is Davidson")
	void CountyOfRecord3333() {
		assertEquals("Davidson", customers.get(3332).getCounty());
	}

	@Test
	@DisplayName("Record 3333: State is TN")
	void StateOfRecord3333() {
		assertEquals("TN", customers.get(3332).getState());
	}

	@Test
	@DisplayName("Record 3333: ZIP is 37115")
	void ZIPOfRecord3333() {
		assertEquals("37115", customers.get(3332).getZIP());
	}

	@Test
	@DisplayName("Record 3333: Phone is 615-868-4861")
	void PhoneOfRecord3333() {
		assertEquals("615-868-4861", customers.get(3332).getPhone());
	}

	@Test
	@DisplayName("Record 3333: Fax is 615-868-3174")
	void FaxOfRecord3333() {
		assertEquals("615-868-3174", customers.get(3332).getFax());
	}

	@Test
	@DisplayName("Record 3333: Email is claude@piscitello.com")
	void EmailOfRecord3333() {
		assertEquals("claude@piscitello.com", customers.get(3332).getEmail());
	}

	@Test
	@DisplayName("Record 3333: Web is http://www.claudepiscitello.com")
	void WebOfRecord3333() {
		assertEquals("http://www.claudepiscitello.com", customers.get(3332).getWeb());
	}
}
