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

@Tag("18")
class Record_4223 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4223: FirstName is Delbert")
	void FirstNameOfRecord4223() {
		assertEquals("Delbert", customers.get(4222).getFirstName());
	}

	@Test
	@DisplayName("Record 4223: LastName is Howell")
	void LastNameOfRecord4223() {
		assertEquals("Howell", customers.get(4222).getLastName());
	}

	@Test
	@DisplayName("Record 4223: Company is Siegel, Andrew J Esq")
	void CompanyOfRecord4223() {
		assertEquals("Siegel, Andrew J Esq", customers.get(4222).getCompany());
	}

	@Test
	@DisplayName("Record 4223: Address is 230 S Dunworth St")
	void AddressOfRecord4223() {
		assertEquals("230 S Dunworth St", customers.get(4222).getAddress());
	}

	@Test
	@DisplayName("Record 4223: City is Visalia")
	void CityOfRecord4223() {
		assertEquals("Visalia", customers.get(4222).getCity());
	}

	@Test
	@DisplayName("Record 4223: County is Tulare")
	void CountyOfRecord4223() {
		assertEquals("Tulare", customers.get(4222).getCounty());
	}

	@Test
	@DisplayName("Record 4223: State is CA")
	void StateOfRecord4223() {
		assertEquals("CA", customers.get(4222).getState());
	}

	@Test
	@DisplayName("Record 4223: ZIP is 93292")
	void ZIPOfRecord4223() {
		assertEquals("93292", customers.get(4222).getZIP());
	}

	@Test
	@DisplayName("Record 4223: Phone is 559-627-3602")
	void PhoneOfRecord4223() {
		assertEquals("559-627-3602", customers.get(4222).getPhone());
	}

	@Test
	@DisplayName("Record 4223: Fax is 559-627-6828")
	void FaxOfRecord4223() {
		assertEquals("559-627-6828", customers.get(4222).getFax());
	}

	@Test
	@DisplayName("Record 4223: Email is delbert@howell.com")
	void EmailOfRecord4223() {
		assertEquals("delbert@howell.com", customers.get(4222).getEmail());
	}

	@Test
	@DisplayName("Record 4223: Web is http://www.delberthowell.com")
	void WebOfRecord4223() {
		assertEquals("http://www.delberthowell.com", customers.get(4222).getWeb());
	}
}
