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

@Tag("13")
class Record_1304 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1304: FirstName is Greg")
	void FirstNameOfRecord1304() {
		assertEquals("Greg", customers.get(1303).getFirstName());
	}

	@Test
	@DisplayName("Record 1304: LastName is Borsh")
	void LastNameOfRecord1304() {
		assertEquals("Borsh", customers.get(1303).getLastName());
	}

	@Test
	@DisplayName("Record 1304: Company is Crosstown Press")
	void CompanyOfRecord1304() {
		assertEquals("Crosstown Press", customers.get(1303).getCompany());
	}

	@Test
	@DisplayName("Record 1304: Address is 3085 John F Kennedy Blvd")
	void AddressOfRecord1304() {
		assertEquals("3085 John F Kennedy Blvd", customers.get(1303).getAddress());
	}

	@Test
	@DisplayName("Record 1304: City is Jersey City")
	void CityOfRecord1304() {
		assertEquals("Jersey City", customers.get(1303).getCity());
	}

	@Test
	@DisplayName("Record 1304: County is Hudson")
	void CountyOfRecord1304() {
		assertEquals("Hudson", customers.get(1303).getCounty());
	}

	@Test
	@DisplayName("Record 1304: State is NJ")
	void StateOfRecord1304() {
		assertEquals("NJ", customers.get(1303).getState());
	}

	@Test
	@DisplayName("Record 1304: ZIP is 7306")
	void ZIPOfRecord1304() {
		assertEquals("7306", customers.get(1303).getZIP());
	}

	@Test
	@DisplayName("Record 1304: Phone is 201-656-0195")
	void PhoneOfRecord1304() {
		assertEquals("201-656-0195", customers.get(1303).getPhone());
	}

	@Test
	@DisplayName("Record 1304: Fax is 201-656-1637")
	void FaxOfRecord1304() {
		assertEquals("201-656-1637", customers.get(1303).getFax());
	}

	@Test
	@DisplayName("Record 1304: Email is Greg@borsh.com")
	void EmailOfRecord1304() {
		assertEquals("Greg@borsh.com", customers.get(1303).getEmail());
	}

	@Test
	@DisplayName("Record 1304: Web is http://www.Gregborsh.com")
	void WebOfRecord1304() {
		assertEquals("http://www.Gregborsh.com", customers.get(1303).getWeb());
	}
}
