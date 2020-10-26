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
class Record_4071 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4071: FirstName is Jeannette")
	void FirstNameOfRecord4071() {
		assertEquals("Jeannette", customers.get(4070).getFirstName());
	}

	@Test
	@DisplayName("Record 4071: LastName is Altes")
	void LastNameOfRecord4071() {
		assertEquals("Altes", customers.get(4070).getLastName());
	}

	@Test
	@DisplayName("Record 4071: Company is Fresno Neon Sign Co Inc")
	void CompanyOfRecord4071() {
		assertEquals("Fresno Neon Sign Co Inc", customers.get(4070).getCompany());
	}

	@Test
	@DisplayName("Record 4071: Address is 1221 Mckinney St  #-1108")
	void AddressOfRecord4071() {
		assertEquals("1221 Mckinney St  #-1108", customers.get(4070).getAddress());
	}

	@Test
	@DisplayName("Record 4071: City is Houston")
	void CityOfRecord4071() {
		assertEquals("Houston", customers.get(4070).getCity());
	}

	@Test
	@DisplayName("Record 4071: County is Harris")
	void CountyOfRecord4071() {
		assertEquals("Harris", customers.get(4070).getCounty());
	}

	@Test
	@DisplayName("Record 4071: State is TX")
	void StateOfRecord4071() {
		assertEquals("TX", customers.get(4070).getState());
	}

	@Test
	@DisplayName("Record 4071: ZIP is 77010")
	void ZIPOfRecord4071() {
		assertEquals("77010", customers.get(4070).getZIP());
	}

	@Test
	@DisplayName("Record 4071: Phone is 713-759-2892")
	void PhoneOfRecord4071() {
		assertEquals("713-759-2892", customers.get(4070).getPhone());
	}

	@Test
	@DisplayName("Record 4071: Fax is 713-759-9221")
	void FaxOfRecord4071() {
		assertEquals("713-759-9221", customers.get(4070).getFax());
	}

	@Test
	@DisplayName("Record 4071: Email is jeannette@altes.com")
	void EmailOfRecord4071() {
		assertEquals("jeannette@altes.com", customers.get(4070).getEmail());
	}

	@Test
	@DisplayName("Record 4071: Web is http://www.jeannettealtes.com")
	void WebOfRecord4071() {
		assertEquals("http://www.jeannettealtes.com", customers.get(4070).getWeb());
	}
}
