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
class Record_469 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 469: FirstName is Emilie")
	void FirstNameOfRecord469() {
		assertEquals("Emilie", customers.get(468).getFirstName());
	}

	@Test
	@DisplayName("Record 469: LastName is Trisdale")
	void LastNameOfRecord469() {
		assertEquals("Trisdale", customers.get(468).getLastName());
	}

	@Test
	@DisplayName("Record 469: Company is Bulgin, Jackie Realtor")
	void CompanyOfRecord469() {
		assertEquals("Bulgin, Jackie Realtor", customers.get(468).getCompany());
	}

	@Test
	@DisplayName("Record 469: Address is 405 Fairview Ave Nw")
	void AddressOfRecord469() {
		assertEquals("405 Fairview Ave Nw", customers.get(468).getAddress());
	}

	@Test
	@DisplayName("Record 469: City is Seattle")
	void CityOfRecord469() {
		assertEquals("Seattle", customers.get(468).getCity());
	}

	@Test
	@DisplayName("Record 469: County is King")
	void CountyOfRecord469() {
		assertEquals("King", customers.get(468).getCounty());
	}

	@Test
	@DisplayName("Record 469: State is WA")
	void StateOfRecord469() {
		assertEquals("WA", customers.get(468).getState());
	}

	@Test
	@DisplayName("Record 469: ZIP is 98109")
	void ZIPOfRecord469() {
		assertEquals("98109", customers.get(468).getZIP());
	}

	@Test
	@DisplayName("Record 469: Phone is 206-628-2471")
	void PhoneOfRecord469() {
		assertEquals("206-628-2471", customers.get(468).getPhone());
	}

	@Test
	@DisplayName("Record 469: Fax is 206-628-4724")
	void FaxOfRecord469() {
		assertEquals("206-628-4724", customers.get(468).getFax());
	}

	@Test
	@DisplayName("Record 469: Email is emilie@trisdale.com")
	void EmailOfRecord469() {
		assertEquals("emilie@trisdale.com", customers.get(468).getEmail());
	}

	@Test
	@DisplayName("Record 469: Web is http://www.emilietrisdale.com")
	void WebOfRecord469() {
		assertEquals("http://www.emilietrisdale.com", customers.get(468).getWeb());
	}
}
