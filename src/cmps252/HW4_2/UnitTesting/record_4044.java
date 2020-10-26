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
class Record_4044 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4044: FirstName is Twila")
	void FirstNameOfRecord4044() {
		assertEquals("Twila", customers.get(4043).getFirstName());
	}

	@Test
	@DisplayName("Record 4044: LastName is Mogannam")
	void LastNameOfRecord4044() {
		assertEquals("Mogannam", customers.get(4043).getLastName());
	}

	@Test
	@DisplayName("Record 4044: Company is Softwind Ltd Fax Line")
	void CompanyOfRecord4044() {
		assertEquals("Softwind Ltd Fax Line", customers.get(4043).getCompany());
	}

	@Test
	@DisplayName("Record 4044: Address is 211 S State St")
	void AddressOfRecord4044() {
		assertEquals("211 S State St", customers.get(4043).getAddress());
	}

	@Test
	@DisplayName("Record 4044: City is Clarks Summit")
	void CityOfRecord4044() {
		assertEquals("Clarks Summit", customers.get(4043).getCity());
	}

	@Test
	@DisplayName("Record 4044: County is Lackawanna")
	void CountyOfRecord4044() {
		assertEquals("Lackawanna", customers.get(4043).getCounty());
	}

	@Test
	@DisplayName("Record 4044: State is PA")
	void StateOfRecord4044() {
		assertEquals("PA", customers.get(4043).getState());
	}

	@Test
	@DisplayName("Record 4044: ZIP is 18411")
	void ZIPOfRecord4044() {
		assertEquals("18411", customers.get(4043).getZIP());
	}

	@Test
	@DisplayName("Record 4044: Phone is 570-586-1843")
	void PhoneOfRecord4044() {
		assertEquals("570-586-1843", customers.get(4043).getPhone());
	}

	@Test
	@DisplayName("Record 4044: Fax is 570-586-8773")
	void FaxOfRecord4044() {
		assertEquals("570-586-8773", customers.get(4043).getFax());
	}

	@Test
	@DisplayName("Record 4044: Email is twila@mogannam.com")
	void EmailOfRecord4044() {
		assertEquals("twila@mogannam.com", customers.get(4043).getEmail());
	}

	@Test
	@DisplayName("Record 4044: Web is http://www.twilamogannam.com")
	void WebOfRecord4044() {
		assertEquals("http://www.twilamogannam.com", customers.get(4043).getWeb());
	}
}
