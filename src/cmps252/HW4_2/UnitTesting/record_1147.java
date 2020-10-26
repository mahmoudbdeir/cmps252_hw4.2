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

@Tag("5")
class Record_1147 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1147: FirstName is Felix")
	void FirstNameOfRecord1147() {
		assertEquals("Felix", customers.get(1146).getFirstName());
	}

	@Test
	@DisplayName("Record 1147: LastName is Manfredonia")
	void LastNameOfRecord1147() {
		assertEquals("Manfredonia", customers.get(1146).getLastName());
	}

	@Test
	@DisplayName("Record 1147: Company is Arundel Financial Services Inc")
	void CompanyOfRecord1147() {
		assertEquals("Arundel Financial Services Inc", customers.get(1146).getCompany());
	}

	@Test
	@DisplayName("Record 1147: Address is 8421 Adams St")
	void AddressOfRecord1147() {
		assertEquals("8421 Adams St", customers.get(1146).getAddress());
	}

	@Test
	@DisplayName("Record 1147: City is Paramount")
	void CityOfRecord1147() {
		assertEquals("Paramount", customers.get(1146).getCity());
	}

	@Test
	@DisplayName("Record 1147: County is Los Angeles")
	void CountyOfRecord1147() {
		assertEquals("Los Angeles", customers.get(1146).getCounty());
	}

	@Test
	@DisplayName("Record 1147: State is CA")
	void StateOfRecord1147() {
		assertEquals("CA", customers.get(1146).getState());
	}

	@Test
	@DisplayName("Record 1147: ZIP is 90723")
	void ZIPOfRecord1147() {
		assertEquals("90723", customers.get(1146).getZIP());
	}

	@Test
	@DisplayName("Record 1147: Phone is 562-633-8435")
	void PhoneOfRecord1147() {
		assertEquals("562-633-8435", customers.get(1146).getPhone());
	}

	@Test
	@DisplayName("Record 1147: Fax is 562-633-1054")
	void FaxOfRecord1147() {
		assertEquals("562-633-1054", customers.get(1146).getFax());
	}

	@Test
	@DisplayName("Record 1147: Email is felix@manfredonia.com")
	void EmailOfRecord1147() {
		assertEquals("felix@manfredonia.com", customers.get(1146).getEmail());
	}

	@Test
	@DisplayName("Record 1147: Web is http://www.felixmanfredonia.com")
	void WebOfRecord1147() {
		assertEquals("http://www.felixmanfredonia.com", customers.get(1146).getWeb());
	}
}
