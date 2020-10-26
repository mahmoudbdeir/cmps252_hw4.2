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

@Tag("28")
class Record_2287 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2287: FirstName is Darron")
	void FirstNameOfRecord2287() {
		assertEquals("Darron", customers.get(2286).getFirstName());
	}

	@Test
	@DisplayName("Record 2287: LastName is Alouf")
	void LastNameOfRecord2287() {
		assertEquals("Alouf", customers.get(2286).getLastName());
	}

	@Test
	@DisplayName("Record 2287: Company is Ida Rooney Nolt & Ahern")
	void CompanyOfRecord2287() {
		assertEquals("Ida Rooney Nolt & Ahern", customers.get(2286).getCompany());
	}

	@Test
	@DisplayName("Record 2287: Address is 960 S 3rd St")
	void AddressOfRecord2287() {
		assertEquals("960 S 3rd St", customers.get(2286).getAddress());
	}

	@Test
	@DisplayName("Record 2287: City is Louisville")
	void CityOfRecord2287() {
		assertEquals("Louisville", customers.get(2286).getCity());
	}

	@Test
	@DisplayName("Record 2287: County is Jefferson")
	void CountyOfRecord2287() {
		assertEquals("Jefferson", customers.get(2286).getCounty());
	}

	@Test
	@DisplayName("Record 2287: State is KY")
	void StateOfRecord2287() {
		assertEquals("KY", customers.get(2286).getState());
	}

	@Test
	@DisplayName("Record 2287: ZIP is 40203")
	void ZIPOfRecord2287() {
		assertEquals("40203", customers.get(2286).getZIP());
	}

	@Test
	@DisplayName("Record 2287: Phone is 502-584-0100")
	void PhoneOfRecord2287() {
		assertEquals("502-584-0100", customers.get(2286).getPhone());
	}

	@Test
	@DisplayName("Record 2287: Fax is 502-584-3226")
	void FaxOfRecord2287() {
		assertEquals("502-584-3226", customers.get(2286).getFax());
	}

	@Test
	@DisplayName("Record 2287: Email is darron@alouf.com")
	void EmailOfRecord2287() {
		assertEquals("darron@alouf.com", customers.get(2286).getEmail());
	}

	@Test
	@DisplayName("Record 2287: Web is http://www.darronalouf.com")
	void WebOfRecord2287() {
		assertEquals("http://www.darronalouf.com", customers.get(2286).getWeb());
	}
}
