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

@Tag("2")
class Record_4164 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4164: FirstName is Leanne")
	void FirstNameOfRecord4164() {
		assertEquals("Leanne", customers.get(4163).getFirstName());
	}

	@Test
	@DisplayName("Record 4164: LastName is Diffenderfer")
	void LastNameOfRecord4164() {
		assertEquals("Diffenderfer", customers.get(4163).getLastName());
	}

	@Test
	@DisplayName("Record 4164: Company is Barr Construction Co Inc")
	void CompanyOfRecord4164() {
		assertEquals("Barr Construction Co Inc", customers.get(4163).getCompany());
	}

	@Test
	@DisplayName("Record 4164: Address is 333 2nd St N")
	void AddressOfRecord4164() {
		assertEquals("333 2nd St N", customers.get(4163).getAddress());
	}

	@Test
	@DisplayName("Record 4164: City is Hopkins")
	void CityOfRecord4164() {
		assertEquals("Hopkins", customers.get(4163).getCity());
	}

	@Test
	@DisplayName("Record 4164: County is Hennepin")
	void CountyOfRecord4164() {
		assertEquals("Hennepin", customers.get(4163).getCounty());
	}

	@Test
	@DisplayName("Record 4164: State is MN")
	void StateOfRecord4164() {
		assertEquals("MN", customers.get(4163).getState());
	}

	@Test
	@DisplayName("Record 4164: ZIP is 55343")
	void ZIPOfRecord4164() {
		assertEquals("55343", customers.get(4163).getZIP());
	}

	@Test
	@DisplayName("Record 4164: Phone is 952-938-3018")
	void PhoneOfRecord4164() {
		assertEquals("952-938-3018", customers.get(4163).getPhone());
	}

	@Test
	@DisplayName("Record 4164: Fax is 952-938-4805")
	void FaxOfRecord4164() {
		assertEquals("952-938-4805", customers.get(4163).getFax());
	}

	@Test
	@DisplayName("Record 4164: Email is leanne@diffenderfer.com")
	void EmailOfRecord4164() {
		assertEquals("leanne@diffenderfer.com", customers.get(4163).getEmail());
	}

	@Test
	@DisplayName("Record 4164: Web is http://www.leannediffenderfer.com")
	void WebOfRecord4164() {
		assertEquals("http://www.leannediffenderfer.com", customers.get(4163).getWeb());
	}
}
