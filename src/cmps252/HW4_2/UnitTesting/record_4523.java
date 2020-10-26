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

@Tag("29")
class Record_4523 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4523: FirstName is Lawerence")
	void FirstNameOfRecord4523() {
		assertEquals("Lawerence", customers.get(4522).getFirstName());
	}

	@Test
	@DisplayName("Record 4523: LastName is Varenhorst")
	void LastNameOfRecord4523() {
		assertEquals("Varenhorst", customers.get(4522).getLastName());
	}

	@Test
	@DisplayName("Record 4523: Company is Johnson, Sidney J")
	void CompanyOfRecord4523() {
		assertEquals("Johnson, Sidney J", customers.get(4522).getCompany());
	}

	@Test
	@DisplayName("Record 4523: Address is 230 S Dunworth St")
	void AddressOfRecord4523() {
		assertEquals("230 S Dunworth St", customers.get(4522).getAddress());
	}

	@Test
	@DisplayName("Record 4523: City is Visalia")
	void CityOfRecord4523() {
		assertEquals("Visalia", customers.get(4522).getCity());
	}

	@Test
	@DisplayName("Record 4523: County is Tulare")
	void CountyOfRecord4523() {
		assertEquals("Tulare", customers.get(4522).getCounty());
	}

	@Test
	@DisplayName("Record 4523: State is CA")
	void StateOfRecord4523() {
		assertEquals("CA", customers.get(4522).getState());
	}

	@Test
	@DisplayName("Record 4523: ZIP is 93292")
	void ZIPOfRecord4523() {
		assertEquals("93292", customers.get(4522).getZIP());
	}

	@Test
	@DisplayName("Record 4523: Phone is 559-627-0993")
	void PhoneOfRecord4523() {
		assertEquals("559-627-0993", customers.get(4522).getPhone());
	}

	@Test
	@DisplayName("Record 4523: Fax is 559-627-1688")
	void FaxOfRecord4523() {
		assertEquals("559-627-1688", customers.get(4522).getFax());
	}

	@Test
	@DisplayName("Record 4523: Email is lawerence@varenhorst.com")
	void EmailOfRecord4523() {
		assertEquals("lawerence@varenhorst.com", customers.get(4522).getEmail());
	}

	@Test
	@DisplayName("Record 4523: Web is http://www.lawerencevarenhorst.com")
	void WebOfRecord4523() {
		assertEquals("http://www.lawerencevarenhorst.com", customers.get(4522).getWeb());
	}
}
